package com.example.recipebookapp.data

object FakeRecipe {
    val all = listOf(
        Recipe(
            id = 1,
            title = "Spaghetti Aglio e Olio",
            ingredients = listOf("200g spaghetti", "3 cloves garlic", "Olive oil", "Chili flakes", "Parsley", "Salt"),
            steps = listOf(
                "Cook spaghetti in salted water.",
                "Sauté sliced garlic in olive oil until fragrant.",
                "Add chili flakes; toss pasta with a splash of pasta water.",
                "Finish with chopped parsley and serve."
            )
        ),
        Recipe(
            id = 2,
            title = "Avocado Toast Deluxe",
            ingredients = listOf("2 slices sourdough", "1 avocado", "Lemon", "Salt", "Pepper", "Chili flakes"),
            steps = listOf(
                "Toast bread.",
                "Mash avocado with lemon, salt, and pepper.",
                "Spread and top with chili flakes."
            )
        ),
        Recipe(
            id = 3,
            title = "Blueberry Pancakes",
            ingredients = listOf("1 cup flour", "1 tbsp sugar", "1 tsp baking powder", "1 egg", "3/4 cup milk", "Blueberries"),
            steps = listOf(
                "Whisk dry ingredients, then add egg and milk.",
                "Fold in blueberries.",
                "Cook until bubbles form; flip and finish."
            )
        )
    )
    //Sort By alphabet by name of Recipe
        .sortedBy { it.title }
}
