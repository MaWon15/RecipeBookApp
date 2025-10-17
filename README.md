app/
 └─ java/.../recipeapp/
     ├─ data/
     │   ├─ Recipe.kt
     │   └─ FakeRecipes.kt        // 50 item
     ├─ vm/
     │   └─ RecipeViewModel.kt
     ├─ ui/
     │   ├─ HomeScreen.kt         // owner B
     │   ├─ FavoritesScreen.kt    // owner C
     │   └─ DetailsScreen.kt      // owner D
     └─ MainActivity.kt           // owner A (NavHost)
