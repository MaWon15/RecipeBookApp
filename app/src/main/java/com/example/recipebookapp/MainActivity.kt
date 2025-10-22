package com.example.recipebookapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel

import com.example.recipebookapp.ui.theme.FavoritesScreen
//import com.example.recipebookapp.ui.theme.DetailScreen
import com.example.recipebookapp.ui.theme.HomeScreen
import com.example.recipebookapp.ui.theme.RecipeBookAppTheme
import com.example.recipebookapp.vm.RecipeViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipeBookAppTheme {
                TopTabsApp()
            }
        }
    }
}

private enum class TopTab(val route: String, val label: String) {
    HOME("home", "Home"),
    FAV("favorites", "Fav")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopTabsApp() {
    val navController = rememberNavController()
    val vm: RecipeViewModel = viewModel()

    var selectedTab by remember { mutableIntStateOf(0) }
    val tabs = listOf("Home", "Fav")

    Scaffold(
        topBar = {
            TabRow(selectedTabIndex = selectedTab) {
                tabs.forEachIndexed { index, label ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = {
                            selectedTab = index
                            when (index) {
                                0 -> navController.navigate("home") {
                                    popUpTo("home") { inclusive = true }
                                }
                                1 -> navController.navigate("favorites") {
                                    popUpTo("favorites") { inclusive = true }
                                }
                            }
                        },
                        text = { Text(label) }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = TopTab.HOME.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") {
                HomeScreen(
                    recipes = vm.recipes,
                    favoriteIds = vm.favoriteIds,
                    onRecipeClick = { id -> navController.navigate("details/$id") },
                    onToggleFavorite = { id -> vm.toggleFavorite(id) },
                    onOpenFavorites = {
                        selectedTab = 1
                        navController.navigate(TopTab.FAV.route) {
                            popUpTo(TopTab.FAV.route) { inclusive = true }
                        }
                    },
                    vm = vm
                )
            }

            composable(TopTab.FAV.route) {
                val favRecipes = remember(vm.recipes, vm.favoriteIds) {
                    vm.recipes.filter { it.id in vm.favoriteIds }
                }
                FavoritesScreen(
                    favoriteRecipes = favRecipes,
                    favoriteIds = vm.favoriteIds,
                    onToggleFavorite = {id -> vm.toggleFavorite(id)},
                    onRecipeClick = { id -> navController.navigate("details/$id")},
                    vm = vm
                )

            }

            //composable("details/{id}") { backStackEntry ->
            //    val id = backStackEntry.arguments?.getString("id")?.toIntOrNull() ?: -1
            //    DetailScreen(
            //        vm = vm,
            //        id = id,
            //        onBack = { navController.popBackStack() }
            //    )
            //}
        }
    }
}



