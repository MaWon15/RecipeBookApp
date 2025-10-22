package com.example.recipebookapp.data

object FakeRecipe {
    val all = listOf(
        Recipe(
            id = 1,
            title = "Spaghetti Aglio e Olio",
            ingredients = listOf(
                "200g spaghetti",
                "3 cloves garlic",
                "Olive oil",
                "Chili flakes",
                "Parsley",
                "Salt"
            ),
            steps = listOf(
                "Cook spaghetti in salted water.",
                "Sauté sliced garlic in olive oil until fragrant.",
                "Add chili flakes; toss pasta with a splash of pasta water.",
                "Finish with chopped parsley and serve."
            ),
            difficulty = 2,
            country = "🇮🇹"
        ),
        Recipe(
            id = 2,
            title = "Avocado Toast Deluxe",
            ingredients = listOf(
                "2 slices sourdough",
                "1 avocado",
                "Lemon",
                "Salt",
                "Pepper",
                "Chili flakes"
            ),
            steps = listOf(
                "Toast bread.",
                "Mash avocado with lemon, salt, and pepper.",
                "Spread and top with chili flakes."
            ),
            difficulty = 1,
            country = "🇺🇸"
        ),
        Recipe(
            id = 3,
            title = "Blueberry Pancakes",
            ingredients = listOf(
                "1 cup flour",
                "1 tbsp sugar",
                "1 tsp baking powder",
                "1 egg",
                "3/4 cup milk",
                "Blueberries"
            ),
            steps = listOf(
                "Whisk dry ingredients, then add egg and milk.",
                "Fold in blueberries.",
                "Cook until bubbles form; flip and finish."
            ),
            difficulty = 1,
            country = "🇺🇸"
        ),
        Recipe(
            id = 4,
            title = "Sushi Rolls",
            ingredients = listOf(
                "2 cups sushi rice",
                "Nori sheets",
                "Rice vinegar",
                "Cucumber",
                "Avocado",
                "Raw salmon"
            ),
            steps = listOf(
                "Prepare sushi rice with rice vinegar.",
                "Lay nori sheet on mat and spread rice evenly.",
                "Add fillings and roll tightly.",
                "Slice and serve with soy sauce."
            ),
            difficulty = 3,
            country = "🇯🇵"
        ),
        Recipe(
            id = 5,
            title = "Tacos al Pastor",
            ingredients = listOf(
                "500g pork shoulder",
                "Pineapple",
                "Onion",
                "Corn tortillas",
                "Achiote paste",
                "Lime",
                "Cilantro"
            ),
            steps = listOf(
                "Marinate pork with achiote and pineapple juice.",
                "Grill until caramelized.",
                "Serve on tortillas with onion, cilantro, and lime."
            ),
            difficulty = 3,
            country = "🇲🇽"
        ),
        Recipe(
            id = 6,
            title = "Chicken Curry",
            ingredients = listOf(
                "500g chicken",
                "Onion",
                "Garlic",
                "Ginger",
                "Curry powder",
                "Coconut milk",
                "Tomatoes"
            ),
            steps = listOf(
                "Sauté onion, garlic, and ginger.",
                "Add chicken and curry powder.",
                "Pour in coconut milk and tomatoes.",
                "Simmer until chicken is cooked through."
            ),
            difficulty = 2,
            country = "🇮🇳"
        ),
        Recipe(
            id = 7,
            title = "Beef Stroganoff",
            ingredients = listOf(
                "400g beef strips",
                "Mushrooms",
                "Onion",
                "Sour cream",
                "Butter",
                "Paprika",
                "Egg noodles"
            ),
            steps = listOf(
                "Sauté beef and remove from pan.",
                "Cook onions and mushrooms.",
                "Add paprika and sour cream.",
                "Return beef and serve over noodles."
            ),
            difficulty = 2,
            country = "🇷🇺"
        ),
        Recipe(
            id = 8,
            title = "Pad Thai",
            ingredients = listOf(
                "200g rice noodles",
                "Shrimp",
                "Eggs",
                "Bean sprouts",
                "Peanuts",
                "Tamarind paste",
                "Fish sauce"
            ),
            steps = listOf(
                "Soak noodles until soft.",
                "Cook shrimp and eggs in wok.",
                "Add noodles, tamarind sauce, and sprouts.",
                "Top with crushed peanuts."
            ),
            difficulty = 3,
            country = "🇹🇭"
        ),
        Recipe(
            id = 9,
            title = "Croque Monsieur",
            ingredients = listOf(
                "4 slices white bread",
                "Ham",
                "Gruyère cheese",
                "Butter",
                "Béchamel sauce"
            ),
            steps = listOf(
                "Spread béchamel on bread.",
                "Add ham and cheese between slices.",
                "Top with more sauce and cheese.",
                "Bake until golden and bubbly."
            ),
            difficulty = 2,
            country = "🇫🇷"
        ),
        Recipe(
            id = 10,
            title = "Shakshuka",
            ingredients = listOf(
                "4 eggs",
                "Tomatoes",
                "Onion",
                "Garlic",
                "Bell pepper",
                "Paprika",
                "Cumin"
            ),
            steps = listOf(
                "Sauté onion, garlic, and pepper.",
                "Add tomatoes and spices; simmer until thick.",
                "Make wells and crack eggs into sauce.",
                "Cover and cook until eggs are set."
            ),
            difficulty = 2,
            country = "🇮🇱"
        ),
        Recipe(
            id = 11,
            title = "Pierogi",
            ingredients = listOf(
                "2 cups flour",
                "1 egg",
                "1/2 cup water",
                "Potatoes",
                "Onion",
                "Butter"
            ),
            steps = listOf(
                "Make dough and roll thin.",
                "Prepare potato filling.",
                "Cut circles, fill, and seal edges.",
                "Boil until they float, then pan-fry in butter."
            ),
            difficulty = 3,
            country = "🇵🇱"
        ),
        Recipe(
            id = 12,
            title = "Feijoada",
            ingredients = listOf(
                "500g black beans",
                "300g pork",
                "300g sausage",
                "Onion",
                "Garlic",
                "Bay leaves",
                "Rice"
            ),
            steps = listOf(
                "Soak beans overnight.",
                "Cook meats and add beans with spices.",
                "Simmer until thick and flavorful.",
                "Serve with rice."
            ),
            difficulty = 3,
            country = "🇧🇷"
        ),
        Recipe(
            id = 13,
            title = "Poutine",
            ingredients = listOf(
                "French fries",
                "Cheese curds",
                "Beef gravy"
            ),
            steps = listOf(
                "Fry potatoes until crisp.",
                "Place fries on plate, top with cheese curds.",
                "Pour hot gravy over to melt cheese."
            ),
            difficulty = 1,
            country = "🇨🇦"
        ),
        Recipe(
            id = 14,
            title = "Paella",
            ingredients = listOf(
                "1 cup rice",
                "Saffron",
                "Chicken",
                "Shrimp",
                "Peas",
                "Bell pepper",
                "Olive oil"
            ),
            steps = listOf(
                "Sauté chicken and vegetables.",
                "Add rice and saffron broth.",
                "Simmer and add seafood.",
                "Cook until liquid is absorbed."
            ),
            difficulty = 3,
            country = "🇪🇸"
        ),
        Recipe(
            id = 15,
            title = "Kimchi Fried Rice",
            ingredients = listOf(
                "2 cups cooked rice",
                "Kimchi",
                "Eggs",
                "Soy sauce",
                "Sesame oil",
                "Green onion"
            ),
            steps = listOf(
                "Sauté kimchi and rice.",
                "Add soy sauce and sesame oil.",
                "Top with fried egg and green onions."
            ),
            difficulty = 2,
            country = "🇰🇷"
        ),
        Recipe(
            id = 16,
            title = "Fish and Chips",
            ingredients = listOf(
                "White fish fillets",
                "Flour",
                "Beer",
                "Potatoes",
                "Salt",
                "Oil"
            ),
            steps = listOf(
                "Make batter with flour and beer.",
                "Dip fish and fry until golden.",
                "Serve with fries and salt."
            ),
            difficulty = 2,
            country = "🇬🇧"
        ),
        Recipe(
            id = 17,
            title = "Falafel",
            ingredients = listOf(
                "Chickpeas",
                "Garlic",
                "Onion",
                "Parsley",
                "Cumin",
                "Coriander",
                "Flour"
            ),
            steps = listOf(
                "Blend chickpeas with herbs and spices.",
                "Form balls and fry until crisp.",
                "Serve with pita and tahini sauce."
            ),
            difficulty = 2,
            country = "🇱🇧"
        ),
        Recipe(
            id = 18,
            title = "Beef Bulgogi",
            ingredients = listOf(
                "Beef slices",
                "Soy sauce",
                "Garlic",
                "Sugar",
                "Sesame oil",
                "Green onion"
            ),
            steps = listOf(
                "Marinate beef with sauce mixture.",
                "Grill or pan-fry until caramelized.",
                "Serve with rice and kimchi."
            ),
            difficulty = 2,
            country = "🇰🇷"
        ),
        Recipe(
            id = 19,
            title = "Goulash",
            ingredients = listOf(
                "500g beef",
                "Onion",
                "Paprika",
                "Tomato paste",
                "Potatoes",
                "Carrots"
            ),
            steps = listOf(
                "Brown beef and onions.",
                "Add paprika and tomato paste.",
                "Simmer with potatoes and carrots until tender."
            ),
            difficulty = 3,
            country = "🇭🇺"
        ),
        Recipe(
            id = 20,
            title = "Ceviche",
            ingredients = listOf(
                "White fish",
                "Lime juice",
                "Onion",
                "Cilantro",
                "Chili pepper",
                "Salt"
            ),
            steps = listOf(
                "Marinate fish in lime juice until opaque.",
                "Add chopped onion, cilantro, and chili.",
                "Serve chilled."
            ),
            difficulty = 2,
            country = "🇵🇪"
        ),
        Recipe(
            id = 21,
            title = "Ratatouille",
            ingredients = listOf(
                "Eggplant",
                "Zucchini",
                "Tomatoes",
                "Bell pepper",
                "Onion",
                "Garlic",
                "Olive oil"
            ),
            steps = listOf(
                "Sauté vegetables separately.",
                "Layer in dish with sauce.",
                "Bake until tender."
            ),
            difficulty = 2,
            country = "🇫🇷"
        ),
        Recipe(
            id = 22,
            title = "Hummus",
            ingredients = listOf(
                "Chickpeas",
                "Tahini",
                "Lemon juice",
                "Garlic",
                "Olive oil",
                "Salt"
            ),
            steps = listOf(
                "Blend all ingredients until smooth.",
                "Adjust seasoning to taste.",
                "Serve with pita bread."
            ),
            difficulty = 1,
            country = "🇮🇱"
        ),
        Recipe(
            id = 23,
            title = "Moussaka",
            ingredients = listOf(
                "Eggplant",
                "Ground beef",
                "Tomatoes",
                "Onion",
                "Béchamel sauce",
                "Cheese"
            ),
            steps = listOf(
                "Cook meat sauce with tomatoes.",
                "Layer with eggplant and béchamel.",
                "Bake until golden."
            ),
            difficulty = 3,
            country = "🇬🇷"
        ),
        Recipe(
            id = 24,
            title = "Chili con Carne",
            ingredients = listOf(
                "Ground beef",
                "Beans",
                "Tomatoes",
                "Onion",
                "Garlic",
                "Chili powder"
            ),
            steps = listOf(
                "Cook beef and onions.",
                "Add beans, tomatoes, and spices.",
                "Simmer until thick."
            ),
            difficulty = 2,
            country = "🇲🇽"
        ),
        Recipe(
            id = 25,
            title = "Shepherd’s Pie",
            ingredients = listOf(
                "Ground lamb",
                "Onion",
                "Carrots",
                "Peas",
                "Mashed potatoes",
                "Butter"
            ),
            steps = listOf(
                "Cook filling and place in dish.",
                "Top with mashed potatoes.",
                "Bake until golden."
            ),
            difficulty = 2,
            country = "🇬🇧"
        ),
        Recipe(
            id = 26,
            title = "Tom Yum Soup",
            ingredients = listOf(
                "Shrimp",
                "Lemongrass",
                "Galangal",
                "Lime leaves",
                "Chili paste",
                "Lime juice"
            ),
            steps = listOf(
                "Boil broth with herbs.",
                "Add shrimp and chili paste.",
                "Finish with lime juice."
            ),
            difficulty = 3,
            country = "🇹🇭"
        ),
        Recipe(
            id = 27,
            title = "Empanadas",
            ingredients = listOf(
                "Flour",
                "Butter",
                "Ground beef",
                "Onion",
                "Egg",
                "Olives"
            ),
            steps = listOf(
                "Make dough and roll out circles.",
                "Add filling and fold over.",
                "Bake or fry until golden."
            ),
            difficulty = 3,
            country = "🇦🇷"
        ),
        Recipe(
            id = 28,
            title = "Borscht",
            ingredients = listOf(
                "Beets",
                "Cabbage",
                "Potatoes",
                "Carrots",
                "Onion",
                "Sour cream"
            ),
            steps = listOf(
                "Cook vegetables in broth.",
                "Add beets and simmer.",
                "Serve with sour cream."
            ),
            difficulty = 2,
            country = "🇺🇦"
        ),
        Recipe(
            id = 29,
            title = "Pho",
            ingredients = listOf(
                "Beef bones",
                "Rice noodles",
                "Star anise",
                "Cinnamon",
                "Ginger",
                "Onion",
                "Fish sauce"
            ),
            steps = listOf(
                "Simmer bones and spices for broth.",
                "Cook noodles separately.",
                "Serve with broth, beef slices, and herbs."
            ),
            difficulty = 3,
            country = "🇻🇳"
        ),
        Recipe(
            id = 30,
            title = "Tagine",
            ingredients = listOf(
                "Chicken",
                "Onion",
                "Garlic",
                "Lemon",
                "Olives",
                "Cumin",
                "Cinnamon"
            ),
            steps = listOf(
                "Brown chicken with spices.",
                "Add onions, garlic, and lemon.",
                "Simmer slowly until tender."
            ),
            difficulty = 3,
            country = "🇲🇦"
        ),
        Recipe(
            id = 31,
            title = "Carbonara",
            ingredients = listOf(
                "200g spaghetti",
                "100g pancetta",
                "2 eggs",
                "50g Parmesan cheese",
                "Black pepper",
                "Salt"
            ),
            steps = listOf(
                "Cook pasta in salted water.",
                "Fry pancetta until crisp.",
                "Whisk eggs and cheese together.",
                "Combine pasta, pancetta, and egg mixture off heat.",
                "Serve with black pepper."
            ),
            difficulty = 2,
            country = "🇮🇹"
        ),
        Recipe(
            id = 32,
            title = "Baklava",
            ingredients = listOf(
                "Phyllo dough",
                "Walnuts",
                "Butter",
                "Sugar",
                "Honey",
                "Cinnamon"
            ),
            steps = listOf(
                "Layer phyllo with butter and nuts.",
                "Bake until golden.",
                "Pour honey syrup over cooled layers."
            ),
            difficulty = 3,
            country = "🇹🇷"
        ),
        Recipe(
            id = 33,
            title = "Couscous with Vegetables",
            ingredients = listOf(
                "Couscous",
                "Carrots",
                "Zucchini",
                "Chickpeas",
                "Onion",
                "Spices"
            ),
            steps = listOf(
                "Cook vegetables with spices.",
                "Steam couscous until fluffy.",
                "Serve vegetables over couscous."
            ),
            difficulty = 2,
            country = "🇩🇿"
        ),
        Recipe(
            id = 34,
            title = "Irish Stew",
            ingredients = listOf(
                "Lamb",
                "Potatoes",
                "Carrots",
                "Onion",
                "Thyme",
                "Beef stock"
            ),
            steps = listOf(
                "Brown lamb and add vegetables.",
                "Pour in stock and herbs.",
                "Simmer until meat is tender."
            ),
            difficulty = 2,
            country = "🇮🇪"
        ),
        Recipe(
            id = 35,
            title = "Okonomiyaki",
            ingredients = listOf(
                "Cabbage",
                "Flour",
                "Eggs",
                "Pork belly",
                "Mayonnaise",
                "Okonomiyaki sauce"
            ),
            steps = listOf(
                "Mix batter with cabbage and eggs.",
                "Cook pancake and top with pork.",
                "Drizzle with sauces and serve."
            ),
            difficulty = 3,
            country = "🇯🇵"
        ),
        Recipe(
            id = 36,
            title = "Rendang",
            ingredients = listOf(
                "Beef",
                "Coconut milk",
                "Chili",
                "Garlic",
                "Ginger",
                "Lemongrass",
                "Turmeric"
            ),
            steps = listOf(
                "Blend spices into a paste.",
                "Simmer beef in coconut milk and paste.",
                "Cook slowly until sauce thickens and darkens."
            ),
            difficulty = 3,
            country = "🇮🇩"
        ),
        Recipe(
            id = 37,
            title = "Pierna Adobada",
            ingredients = listOf(
                "Pork leg",
                "Guajillo chiles",
                "Garlic",
                "Vinegar",
                "Cumin",
                "Oregano"
            ),
            steps = listOf(
                "Blend adobo sauce ingredients.",
                "Marinate pork overnight.",
                "Roast until tender."
            ),
            difficulty = 3,
            country = "🇲🇽"
        ),
        Recipe(
            id = 38,
            title = "Churrasco",
            ingredients = listOf(
                "Beef steak",
                "Garlic",
                "Olive oil",
                "Salt",
                "Chimichurri sauce"
            ),
            steps = listOf(
                "Marinate steak with oil and garlic.",
                "Grill to desired doneness.",
                "Serve with chimichurri."
            ),
            difficulty = 2,
            country = "🇺🇾"
        ),
        Recipe(
            id = 39,
            title = "Miso Soup",
            ingredients = listOf(
                "Miso paste",
                "Dashi broth",
                "Tofu",
                "Seaweed",
                "Green onions"
            ),
            steps = listOf(
                "Heat dashi broth.",
                "Dissolve miso paste.",
                "Add tofu and seaweed.",
                "Garnish with green onions."
            ),
            difficulty = 1,
            country = "🇯🇵"
        ),
        Recipe(
            id = 40,
            title = "Kebab",
            ingredients = listOf(
                "Lamb cubes",
                "Yogurt",
                "Garlic",
                "Cumin",
                "Paprika",
                "Salt",
                "Skewers"
            ),
            steps = listOf(
                "Marinate lamb in yogurt and spices.",
                "Thread onto skewers.",
                "Grill until cooked through."
            ),
            difficulty = 2,
            country = "🇹🇷"
        ),
        Recipe(
            id = 41,
            title = "Pavlova",
            ingredients = listOf(
                "Egg whites",
                "Sugar",
                "Cornstarch",
                "Vinegar",
                "Whipped cream",
                "Berries"
            ),
            steps = listOf(
                "Beat egg whites with sugar until stiff.",
                "Bake slowly until crisp outside.",
                "Top with cream and berries."
            ),
            difficulty = 3,
            country = "🇳🇿"
        ),
        Recipe(
            id = 42,
            title = "Kaiserschmarrn",
            ingredients = listOf(
                "Flour",
                "Milk",
                "Eggs",
                "Sugar",
                "Butter",
                "Raisins"
            ),
            steps = listOf(
                "Make thick pancake batter.",
                "Cook in butter and tear into pieces.",
                "Dust with sugar and serve."
            ),
            difficulty = 2,
            country = "🇦🇹"
        ),
        Recipe(
            id = 43,
            title = "Jollof Rice",
            ingredients = listOf(
                "Rice",
                "Tomatoes",
                "Onion",
                "Bell pepper",
                "Oil",
                "Spices"
            ),
            steps = listOf(
                "Blend vegetables for sauce.",
                "Fry sauce and add rice.",
                "Cook until rice absorbs all flavor."
            ),
            difficulty = 2,
            country = "🇳🇬"
        ),
        Recipe(
            id = 44,
            title = "Sauerbraten",
            ingredients = listOf(
                "Beef roast",
                "Vinegar",
                "Onion",
                "Carrots",
                "Ginger snaps",
                "Beef broth"
            ),
            steps = listOf(
                "Marinate beef in vinegar and spices for days.",
                "Roast slowly in oven.",
                "Serve with gravy."
            ),
            difficulty = 3,
            country = "🇩🇪"
        ),
        Recipe(
            id = 45,
            title = "Arepas",
            ingredients = listOf(
                "Cornmeal",
                "Water",
                "Salt",
                "Cheese",
                "Butter"
            ),
            steps = listOf(
                "Mix cornmeal with water and salt.",
                "Shape into patties and cook on griddle.",
                "Fill with cheese or meat."
            ),
            difficulty = 1,
            country = "🇻🇪"
        ),
        Recipe(
            id = 46,
            title = "Samosa",
            ingredients = listOf(
                "Flour",
                "Potatoes",
                "Peas",
                "Cumin",
                "Ginger",
                "Oil"
            ),
            steps = listOf(
                "Prepare dough and potato filling.",
                "Fill and fold triangles.",
                "Fry until golden and crisp."
            ),
            difficulty = 3,
            country = "🇮🇳"
        ),
        Recipe(
            id = 47,
            title = "Cassoulet",
            ingredients = listOf(
                "White beans",
                "Sausage",
                "Duck confit",
                "Tomatoes",
                "Garlic",
                "Herbs"
            ),
            steps = listOf(
                "Simmer beans with meats and herbs.",
                "Layer in dish and bake slowly.",
                "Serve hot."
            ),
            difficulty = 3,
            country = "🇫🇷"
        ),
        Recipe(
            id = 48,
            title = "Pancit Canton",
            ingredients = listOf(
                "Egg noodles",
                "Chicken",
                "Shrimp",
                "Carrots",
                "Cabbage",
                "Soy sauce"
            ),
            steps = listOf(
                "Cook meats and vegetables.",
                "Add noodles and sauce.",
                "Stir-fry until well combined."
            ),
            difficulty = 2,
            country = "🇵🇭"
        ),
        Recipe(
            id = 49,
            title = "Bobotie",
            ingredients = listOf(
                "Ground beef",
                "Onion",
                "Curry powder",
                "Raisins",
                "Milk",
                "Eggs",
                "Bread"
            ),
            steps = listOf(
                "Cook meat with spices and raisins.",
                "Top with egg and milk mixture.",
                "Bake until golden."
            ),
            difficulty = 3,
            country = "🇿🇦"
        ),
        Recipe(
            id = 50,
            title = "Clam Chowder",
            ingredients = listOf(
                "Clams",
                "Potatoes",
                "Onion",
                "Celery",
                "Cream",
                "Butter"
            ),
            steps = listOf(
                "Cook vegetables in butter.",
                "Add clams and cream.",
                "Simmer until thick."
            ),
            difficulty = 2,
            country = "🇺🇸"
        )
    )
        .sortedWith(compareBy({ it.country }, { it.title }))
}