package com.example.recipebookapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.recipebookapp.data.Recipe
import androidx.compose.material3.HorizontalDivider
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import com.example.recipebookapp.vm.RecipeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    recipes: List<Recipe>,
    favoriteIds: Set<Int>,
    onRecipeClick: (Int) -> Unit,
    onToggleFavorite: (Int) -> Unit,
    onOpenFavorites: () -> Unit,
    vm: RecipeViewModel
) {
    Scaffold(
        topBar = {
            TopAppBar(
                { Text("Recipes") },
                actions = {
                    IconButton(onClick = onOpenFavorites) {
                        Icon(Icons.AutoMirrored.Filled.List, contentDescription = "Open favorites")
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
fun RecipeRow(
    recipe: Recipe,
    isFavorite: Boolean,
    onToggleFavorite: () -> Unit,
    onClick: () -> Unit
) {
    val rowColor = when (recipe.difficulty) {
        1 -> DifficultyEasy
        2 -> DifficultyMedium
        3 -> DifficultyHard
        else -> MaterialTheme.colorScheme.surface
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .background(rowColor)
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "${recipe.country} ${recipe.title}",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Black,
                modifier = Modifier.weight(1f)
            )

            IconButton(onClick = onToggleFavorite) {
                Box {
                    if (isFavorite) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = null,
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = null,
                            tint = Color.Black
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                }
            }
        }
    }
}