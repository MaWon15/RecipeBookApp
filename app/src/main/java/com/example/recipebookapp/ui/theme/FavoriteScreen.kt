package com.example.recipebookapp.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.recipebookapp.data.Recipe
import androidx.compose.material3.HorizontalDivider
import com.example.recipebookapp.vm.RecipeViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoritesScreen(
    // the list of recipes that have been saved
    favoriteRecipes: List<Recipe>,
    // the set of all favorite IDs
    favoriteIds: Set<Int>,
    onToggleFavorite: (Int) -> Unit,
    onRecipeClick: (Int) -> Unit,
    modifier: Modifier = Modifier,
    vm: RecipeViewModel
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(title = { Text("Favorite Recipes") })
        }
    ) { innerPadding ->

        if (favoriteRecipes.isEmpty()) {
            // display message when no favorites are saved
            Box(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "You haven't added any recipes to your favorites yet.",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 32.dp)
                )
            }
        }
        else
        {
            // Display the list of favorite recipes using the shared RecipeRow
            LazyColumn(modifier = Modifier.padding(innerPadding)) {
                items(favoriteRecipes, key = { it.id }) { recipe ->
                    // Reuse the RecipeRow from HomeScreen.kt
                    RecipeRow(
                        recipe = recipe,
                        isFavorite = recipe.id in favoriteIds,
                        onToggleFavorite = { onToggleFavorite(recipe.id) },
                        onClick = { onRecipeClick(recipe.id) }
                    )
                    HorizontalDivider()
                }
            }
        }
    }
}


