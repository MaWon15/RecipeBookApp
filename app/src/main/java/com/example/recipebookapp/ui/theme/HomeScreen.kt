package com.example.recipebookapp.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.recipebookapp.data.Recipe
import androidx.compose.material3.HorizontalDivider

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    recipes: List<Recipe>,
    favoriteIds: Set<Int>,
    onRecipeClick: (Int) -> Unit,
    onToggleFavorite: (Int) -> Unit,
    onOpenFavorites: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                { Text("Recipes") },
                actions = {
                    IconButton(onClick = onOpenFavorites) {
                        Icon(Icons.Default.List, contentDescription = "Open favorites")
                    }
                },
            )
        }
    ) { padding ->
        LazyColumn(Modifier.padding(padding)) {
            items(recipes, key = { it.id }) { recipe ->
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

@Composable
fun SmallTopAppBar(title: () -> Unit, actions: () -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun RecipeRow(
    recipe: Recipe,
    isFavorite: Boolean,
    onToggleFavorite: () -> Unit,
    onClick: () -> Unit
) {
    Row(
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(recipe.title, style = MaterialTheme.typography.titleMedium, modifier = Modifier.weight(1f))
        IconButton(onClick = onToggleFavorite) {
            Icon(
                if (isFavorite) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                contentDescription = "Toggle favorite"
            )
        }
    }
}
