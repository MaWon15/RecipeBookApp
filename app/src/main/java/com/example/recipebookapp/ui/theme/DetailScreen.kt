package com.example.recipebookapp.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.recipebookapp.vm.RecipeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    vm: RecipeViewModel,
    id: Int,
    onBack: () -> Unit
) {
    val recipe = vm.getRecipe(id)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(recipe?.title ?: "Recipe") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { pad ->
        Column(
            modifier = Modifier
                .padding(pad)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            if (recipe == null) {
                Text("Recipe not found")
            } else {
                Text("Ingredients", style = MaterialTheme.typography.titleMedium)
                Spacer(Modifier.height(8.dp))
                recipe.ingredients.forEach { Text("• $it") }

                Spacer(Modifier.height(16.dp))

                Text("Steps", style = MaterialTheme.typography.titleMedium)
                Spacer(Modifier.height(8.dp))
                recipe.steps.forEachIndexed { i, s -> Text("${i + 1}. $s") }
            }
        }
    }
}


