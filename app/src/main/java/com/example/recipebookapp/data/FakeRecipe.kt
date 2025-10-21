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
                "Salt"),
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
            ingredients = listOf(
                "2 slices sourdough",
                "1 avocado",
                "Lemon", "Salt",
                "Pepper",
                "Chili flakes"),
            steps = listOf(
                "Toast bread.",
                "Mash avocado with lemon, salt, and pepper.",
                "Spread and top with chili flakes."
            )
        ),
        Recipe(
            id = 3,
            title = "Blueberry Pancakes",
            ingredients = listOf(
                "1 cup flour",
                "1 tbsp sugar",
                "1 tsp baking powder",
                "1 egg", "3/4 cup milk",
                "Blueberries"),
            steps = listOf(
                "Whisk dry ingredients, then add egg and milk.",
                "Fold in blueberries.",
                "Cook until bubbles form; flip and finish."
            )
        ),
        Recipe(
            id = 4,
            title = "Stuffed Bell Peppers",
            ingredients = listOf(
                "4 bell peppers",
                "1 cup rice",
                "200g ground beef",
                "1 onion",
                "Tomato sauce"
            ),
            steps = listOf(
                "Cut the tops off bell peppers and remove seeds.",
                "Cook rice and mix with cooked beef, onion, and tomato sauce.",
                "Stuff peppers with mixture and bake at 375°F for 25 minutes."
            )
        ),
        Recipe(
            id = 5,
            title = "scrambled eggs",
            ingredients = listOf("eggs, milk, butter, sea salt, pepper"),
            steps = listOf(
                "beat the eggs, whisk until the yolk and whites are thoroughly combined",
                "add the milk and whisk again, the eggs should be an even yellow color",
                "preheat the pan over medium heat and melt a little butter inside it",
                "out egg mixture and let it cook for a few seconds,undisturbed",
                "continue folding and stirring eggs every few seconds",
                "for a soft, creamy scramble, stop when eggs are mostly set but a liquid egg remains",
                "season to taste with salt and pepper"
            )
        ),
        Recipe(
            id = 6,
            title = "chocolate chip cookies",
            ingredients = listOf(
                    "1 cup salted butter, ",
                    "1 cup granulated sugar, ",
                    "1 cup light brown sugar, ",
                    "2 tsp pure vanilla extract, ",
                    "2 large eggs, ",
                    "3 cups all-purpose flour, ",
                    "1 tsp baking soda, ",
                    "1/2 tsp baking powder, ",
                    "1 tsp sea salt, ",
                    "2 cups chocolate chips"),
            steps = listOf(
                "preheat over to 375 f and line 3 baking sheets with parchment paper set aside.",
                "mix flour, baking soda, baking powder, and sea salt.",
                "cream together butter and sugar until combined.",
                "beat in eggs and vanilla until light (about 1 min)",
                "Mix in the dry ingredients until combined.",
                "Add chocolate chips and mix well.",
                """Roll 2-3 Tablespoons (depending on how large you like your cookies) 
                        of dough at a time into balls and place them evenly spaced on your 
                        prepared cookie sheets.""",
                "Bake in preheated oven for approximately 8-10 minutes. Take them out when they " +
                        "are just barely starting to turn brown.",
                "Let them sit on the baking pan for 5 minutes before removing to cooling rack."
            )
        ),
        Recipe(
            id = 7,
            title = "red velvet cupcakes",
            ingredients = listOf(
                "1⅔ cups all-purpose flour 200g",
                "2 teaspoons cocoa powder",
                "1 cup granulated sugar 200g",
                "1 teaspoon baking powder",
                "¼ teaspoon baking soda",
                "¼ teaspoon kosher salt",
                "¾ cup unsalted butter room temperature (170g)",
                "3 large eggs room temperature",
                "2 tablespoons vanilla extract",
                "¾ cup buttermilk 180ml",
                "Red food coloring"
                ),
            steps = listOf(
                "For the Cupcakes:",
                "Preheat the oven to 350°F",
                "in a large bowl, sift the flour, sugar, cocoa powder baking powder, " +
                        "and baking soda together. Add the salt and give it a whisk to combine.",
                """Cut the room temperature butter into tablespoon-sized pieces then add to the dry 
                        ingredients. Using a paddle attachment, mix on low using until a sandy 
                        mixture forms.""",
                """In another bowl, whisk together the eggs, buttermilk, vanilla, and food coloring. 
                        (Use 1 to 2 tablespoons of liquid food coloring, or 5 to 6 drops of gel 
                        food coloring. More will give a richer red.)""",
                "Slowly add the wet ingredients to the dry ingredients while mixing on low. Mix " +
                        "until combined, scraping the bowl down as needed. Distribute the batter " +
                        "evenly into cupcake papers.",
                "Bake for 15 to 20 minutes or until springy to the touch. Let cool for a few " +
                        "minutes in the pans then remove and cool completely on a wire rack.",
                "For the Cream Cheese Frosting:",
                """In a large mixing bowl or the bowl of a stand mixer fitted with the paddle 
                        attachment, cream the butter on medium speed until smooth and fluffy, 
                        about 2 minutes.""",
                """Add the room temperature cream cheese, vanilla, and salt to the creamed butter. 
                        Beat together on medium speed until well combined. Scrape down the bowl.""",
                """With the mixer on low speed, add the sifted confectioners sugar a cup at a time. 
                        Mix until combined. If you’re wanting a stiffer buttercream, keep adding 
                        more sifted confectioners sugar until it’s the desired texture or chill 
                        the buttercream for a few minutes before piping.""",
                "Transfer the buttercream to a piping bag fitted with a star tip and pipe large " +
                        "dollops on top of each cooled cupcake."

            )
        ),
        Recipe(
            id = 8,
            title = "creamy mashed potatoes",
            ingredients = listOf(
                "4 pounds potatoes russet or Yukon gold",
                "3 cloves garlic optional",
                "⅓ cup melted salted butter",
                "1 cup milk or cream",
                "salt to taste",
                "black pepper to taste"
                ),
            steps = listOf(
                "Peel and quarter potatoes, place in a pot of cold salted water.",
                "Add cloves of garlic (if using) & bring to a boil, cook uncovered 15 minutes or " +
                        "until fork-tender. Drain well.",
                "Heat milk on the stove top (or in the microwave) until warm.",
                "Add butter to the potatoes and begin mashing. Pour in heated milk a little at a " +
                        "time while using a potato masher to reach desired consistency.",
                "Season with salt and pepper. Serve hot."
            )
        ),
        Recipe(
            id = 9,
            title = "gravy",
            ingredients = listOf(
                "▢ 1 chicken stock cube / bouillon cube",
                "▢ 1 beef stock cube / bouillon cube",
                "▢ 2 1/4 cups (565ml) boiling water",
                "▢ 60g/ 4 tbsp butter , unsalted",
                "▢ 4 tbsp flour , plain / all purpose",
                "▢ 1/2 tsp onion powder (ok to omit or sub garlic powder)",
                "▢ 1/4 tsp finely ground black pepper",
                "▢ Salt "
            ),
            steps = listOf(
                "Crumble cubes into boiling water, mix to dissolve.",
                "Melt butter in a saucepan over medium heat.",
                "Add flour, onion powder and pepper. Mix into butter with a wooden spoon or whisk.",
                "While stirring, slowly pour in half the liquid. Once incorporated into the flour " +
                        "butter roux (it will thicken quickly), add remaining liquid and mix.",
                "Stir for 1.5 – 2 minutes until it thickens to a gravy consistency (it's quick as " +
                        "water is already hot). Taste, add more salt and pepper if needed.",
                "Serve over chops, steak, sausages, veggies, roast chicken, pork, beef, lamb."
            )
        ),
        Recipe(
            id = 10,
            title = "Green bean casserole",
            ingredients = listOf("" +
                "2 (15-ounce) cans cut green beans, drained",
                "1 (10.5-ounce) can condensed cream of mushroom soup",
                "3/4 cup milk",
                "1(2.8-ounce) can French fried onions",
                "salt and ground black pepper to taste"
            ),
            steps = listOf(
                "Preheat the oven to 350 degrees F",
                "Mix green beans, condensed cream of mushroom soup, milk, and 1/2 of the fried " +
                        "onions in a 1.5-quart casserole dish",
                "Bake in the preheated oven until heated through and bubbly, about 25 minutes.",
                "Sprinkle remaining onions on top and return to the oven for 5 minutes. Season with " +
                        "salt and pepper to taste. Let rest for a few minutes before serving."
            )
        ),
        Recipe(
            id = 11,
            title = "home made biscuits",
            ingredients = listOf(
                "2 cups all-purpose flour (250g)",
                "1 Tablespoon baking powder",
                "1 Tablespoon granulated sugar",
                "1 teaspoon salt",
                "6 Tablespoons unsalted butter very cold (85g), unsalted European butter is ideal, but not required",
                "¾ cup whole milk¹ (177ml) buttermilk or 2% milk will also work",
            ),
            steps = listOf(
                """For best results, chill your butter in the freezer for 10-20 minutes before 
                        beginning this recipe. It's ideal that the butter is very cold for light, 
                        flaky, buttery biscuits.""",
                """Preheat oven to 425F and line a cookie sheet with nonstick parchment paper. 
                        Set aside.""",
                """Combine flour, baking powder, sugar, and salt in a large bowl and mix well.
                        Set aside.""",
                """Remove your butter from the refrigerator and either cut it into your flour mixture 
                        using a pastry cutter or (preferred) use a box grater to shred the butter 
                        into small pieces and then add to the flour mixture and stir.""",
                """Cut the butter or combine the grated butter until the mixture resembles coarse 
                        crumbs.""",
                """Add milk, use a wooden spoon or spatula to stir until combined (don't over-work 
                        the dough).""",
                """Transfer your biscuit dough to a well-floured surface and use your hands to gently 
                        work the dough together. If the dough is too sticky, add flour until it is 
                        manageable. """,
                """Once the dough is cohesive, fold in half over itself and use your hands to gently 
                        flatten layers together. Rotate the dough 90 degrees and fold in half 
                        again, repeating this step 5-6 times but taking care to not overwork the 
                        dough.""",
                """Use your hands (do not use a rolling pin) to flatten the dough to 1" thick and " +
                        lightly dust a 2 ¾" round biscuit cutter with flour. """,
                """Making close cuts, press the biscuit cutter straight down into the dough and 
                    |drop the biscuit onto your prepared baking sheet.""".trimMargin(),
                """Repeat until you have gotten as many biscuits as possible and place less than 
                    |½" apart on baking sheet. """.trimMargin(),
                """Once you have gotten as many biscuits as possible out of the dough, gently 
                    |re-work the dough to get out another biscuit or two until you have at least 
                    |6 biscuits.""".trimMargin(),
                """Bake on 425F for 12 minutes or until tops are beginning to just turn lightly 
                    |golden brown.""".trimMargin(),
                """If desired, brush with melted salted butter immediately after removing from oven. 
                    |Serve warm and enjoy.""".trimMargin()
            )
        ),
        Recipe(
            id = 12,
            title = "Classic Pancakes",
            ingredients = listOf(
                "1 cup flour",
                "2 tbsp sugar",
                "1 egg",
                "1 cup milk",
                "1 tsp baking powder"
            ),
            steps = listOf(
                "In a bowl, whisk together flour, sugar, and baking powder.",
                "Add milk and egg, then mix until smooth.",
                "Heat a lightly oiled skillet and pour ¼ cup batter for each pancake.",
                "Cook until bubbles form, then flip and cook until golden."
            )
        ),
        Recipe(
            id = 13,
            title = "Spaghetti Bolognese",
            ingredients = listOf(
                "200g spaghetti",
                "1 onion",
                "2 cloves garlic",
                "250g ground beef",
                "1 cup tomato sauce"
            ),
            steps = listOf(
                "Cook spaghetti according to package instructions.",
                "Sauté onion and garlic in olive oil until translucent.",
                "Add beef and cook until browned.",
                "Pour in tomato sauce and simmer for 15 minutes.",
                "Serve over spaghetti with grated cheese."
            )
        ),
        Recipe(
            id = 14,
            title = "Vegetable Curry",
            ingredients = listOf(
                "1 onion",
                "2 carrots",
                "1 potato",
                "1 cup coconut milk",
                "2 tbsp curry paste"
            ),
            steps = listOf(
                "Sauté onion until translucent.",
                "Add chopped vegetables and curry paste, cook for 5 minutes.",
                "Pour in coconut milk and simmer until vegetables are tender."
            )
        ),
        Recipe(
            id = 15,
            title = "Chicken Stir-Fry",
            ingredients = listOf(
                "200g chicken breast",
                "1 bell pepper",
                "1 onion",
                "2 tbsp soy sauce",
                "1 tsp sesame oil"
            ),
            steps = listOf(
                "Slice chicken and vegetables into strips.",
                "Stir-fry chicken until cooked through.",
                "Add vegetables and cook for 3–5 minutes.",
                "Pour in soy sauce and sesame oil, toss well, and serve."
            )
        ),
        Recipe(
            id = 16,
            title = "Chocolate Brownies",
            ingredients = listOf(
                "1/2 cup butter",
                "1 cup sugar",
                "2 eggs",
                "1/3 cup cocoa powder",
                "1/2 cup flour"
            ),
            steps = listOf(
                "Preheat oven to 350°F.",
                "Melt butter, then stir in sugar, eggs, and cocoa.",
                "Add flour and mix until smooth.",
                "Pour into a pan and bake for 20–25 minutes."
            )
        ),
        Recipe(
            id = 17,
            title = "Caprese Salad",
            ingredients = listOf(
                "2 tomatoes",
                "125g mozzarella",
                "Fresh basil leaves",
                "Olive oil",
                "Salt",
                "Pepper"
            ),
            steps = listOf(
                "Slice tomatoes and mozzarella.",
                "Layer them alternately with basil leaves.",
                "Drizzle with olive oil, season with salt and pepper."
            )
        ),
        Recipe(
            id = 18,
            title = "Garlic Butter Shrimp",
            ingredients = listOf(
                "250g shrimp",
                "3 cloves garlic",
                "2 tbsp butter",
                "Lemon juice",
                "Parsley"
            ),
            steps = listOf(
                "Melt butter in a skillet and add minced garlic.",
                "Add shrimp and cook until pink.",
                "Squeeze lemon juice and sprinkle with parsley before serving."
            )
        ),
        Recipe(
            id = 19,
            title = "Banana Smoothie",
            ingredients = listOf(
                "1 banana",
                "1 cup milk",
                "1 tbsp honey",
                "Ice cubes"
            ),
            steps = listOf(
                "Add all ingredients to a blender.",
                "Blend until smooth.",
                "Serve chilled."
            )
        ),
        Recipe(
            id = 20,
            title = "Veggie Omelette",
            ingredients = listOf(
                "2 eggs",
                "1/4 cup diced peppers",
                "1/4 cup onions",
                "Salt",
                "Pepper"
            ),
            steps = listOf(
                "Beat eggs with salt and pepper.",
                "Cook vegetables in a non-stick pan for 2 minutes.",
                "Pour eggs over vegetables and cook until set.",
                "Fold and serve warm."
            )
        ),
        Recipe(
            id = 21,
            title = "Grilled Cheese Sandwich",
            ingredients = listOf(
                "2 slices bread",
                "Butter",
                "2 slices cheese"
            ),
            steps = listOf(
                "Butter the bread slices.",
                "Place cheese between slices.",
                "Grill in a pan until golden brown on both sides."
            )
        ),
        Recipe(
            id = 22,
            title = "Tomato Soup",
            ingredients = listOf(
                "4 tomatoes",
                "1 onion",
                "2 cloves garlic",
                "1 cup vegetable broth"
            ),
            steps = listOf(
                "Sauté onion and garlic until soft.",
                "Add chopped tomatoes and broth.",
                "Simmer for 15 minutes, then blend until smooth."
            )
        ),
        Recipe(
            id = 23,
            title = "Beef Tacos",
            ingredients = listOf(
                "6 taco shells",
                "250g ground beef",
                "1 tomato",
                "Lettuce",
                "Cheddar cheese"
            ),
            steps = listOf(
                "Cook ground beef with seasoning.",
                "Fill taco shells with beef, tomato, lettuce, and cheese."
            )
        ),
        Recipe(
            id = 24,
            title = "Fruit Salad",
            ingredients = listOf(
                "Apple",
                "Banana",
                "Grapes",
                "Strawberries",
                "Honey"
            ),
            steps = listOf(
                "Chop all fruits and place in a bowl.",
                "Drizzle with honey and mix well."
            )
        ),
        Recipe(
            id = 25,
            title = "Garlic Bread",
            ingredients = listOf(
                "1 baguette",
                "3 cloves garlic",
                "2 tbsp butter",
                "Parsley"
            ),
            steps = listOf(
                "Mix butter, minced garlic, and parsley.",
                "Spread on baguette slices and bake until golden."
            )
        ),
        Recipe(
            id = 26,
            title = "Fried Rice",
            ingredients = listOf(
                "1 cup cooked rice",
                "1 egg", "1 carrot",
                "2 tbsp soy sauce"
            ),
            steps = listOf(
                "Scramble the egg and set aside.",
                "Stir-fry vegetables, then add rice and soy sauce.",
                "Mix in scrambled egg before serving."
            )
        ),
        Recipe(
            id = 27,
            title = "Garlic Roasted Potatoes",
            ingredients = listOf(
                "4 potatoes",
                "2 tbsp olive oil",
                "3 cloves garlic",
                "Salt",
                "Pepper",
                "Rosemary"
            ),
            steps = listOf(
                "Preheat oven to 400°F.",
                "Cut potatoes into cubes and toss with oil, garlic, salt, pepper, and rosemary.",
                "Spread on a baking sheet and roast for 30 minutes, flipping halfway."
            )
        ),
        Recipe(
            id = 28,
            title = "Lemonade",
            ingredients = listOf(
                "2 lemons",
                "3 cups water",
                "2 tbsp sugar"
            ),
            steps = listOf(
                "Juice lemons into a pitcher.",
                "Add water and sugar, stir well."
            )
        ),
        Recipe(
            id = 29,
            title = "French Toast",
            ingredients = listOf(
                "2 eggs",
                "1/2 cup milk",
                "2 slices bread",
                "Cinnamon"
            ),
            steps = listOf(
                "Mix eggs, milk, and cinnamon.",
                "Dip bread into mixture and cook on a skillet until golden."
            )
        ),
        Recipe(
            id = 30,
            title = "Chicken Soup",
            ingredients = listOf(
                "200g chicken",
                "1 carrot",
                "1 onion",
                "4 cups broth"
            ),
            steps = listOf(
                "Cook chicken in broth until tender.",
                "Add vegetables and simmer for 20 minutes."
            )
        ),
        Recipe(
            id = 31,
            title = "Greek Salad",
            ingredients = listOf(
                "Cucumber",
                "Tomatoes",
                "Feta cheese",
                "Olives",
                "Olive oil"
            ),
            steps = listOf(
                "Chop vegetables and combine in a bowl.",
                "Add feta and drizzle with olive oil."
            )
        ),
        Recipe(
            id = 32,
            title = "Blueberry Muffins",
            ingredients = listOf(
                "2 cups flour",
                "1 cup sugar",
                "1 cup blueberries",
                "1 egg", "1/2 cup milk"
            ),
            steps = listOf(
                "Preheat oven to 375°F.",
                "Mix dry ingredients, add wet ingredients, then fold in blueberries.",
                "Bake for 20 minutes."
            )
        ),
        Recipe(
            id = 33,
            title = "Caesar Salad",
            ingredients = listOf(
                "Lettuce",
                "Croutons",
                "Parmesan cheese",
                "Caesar dressing"
            ),
            steps = listOf(
                "Toss lettuce with dressing, top with croutons and cheese."
            )
        ),
        Recipe(
            id = 34,
            title = "Omelette Sandwich",
            ingredients = listOf(
                "2 slices bread",
                "2 eggs",
                "Salt",
                "Pepper",
                "Butter"),
            steps = listOf(
                "Make an omelette and place it between buttered toast slices."
            )
        ),
        Recipe(
            id = 35,
            title = "Mango Smoothie",
            ingredients = listOf(
                "1 mango",
                "1 cup yogurt",
                "1 tbsp honey",
                "Ice cubes"
            ),
            steps = listOf(
                "Blend all ingredients until smooth and creamy."
            )
        ),
        Recipe(
            id = 36,
            title = "Garlic Pasta",
            ingredients = listOf(
                "200g pasta",
                "3 cloves garlic",
                "2 tbsp butter",
                "Parmesan"
            ),
            steps = listOf(
                "Boil pasta and drain.",
                "Sauté garlic in butter, add pasta, and toss with Parmesan."
            )
        ),
        Recipe(
            id = 37,
            title = "Cucumber Sandwich",
            ingredients = listOf(
                "2 slices bread",
                "1/2 cucumber",
                "Cream cheese"
            ),
            steps = listOf(
                "Spread cream cheese on bread, layer cucumber slices, and close sandwich."
            )
        ),
        Recipe(
            id = 38,
            title = "Chocolate Milkshake",
            ingredients = listOf(
                "1 cup milk",
                "2 tbsp cocoa powder",
                "1 scoop ice cream"
            ),
            steps = listOf(
                "Blend all ingredients until frothy and smooth."
            )
        ),
        Recipe(
            id = 39,
            title = "Honey Glazed Carrots",
            ingredients = listOf(
                "3 carrots",
                "1 tbsp butter",
                "1 tbsp honey"
            ),
            steps = listOf(
                "Cook carrots until tender, then toss with melted butter and honey."
            )
        ),
        Recipe(
            id = 40,
            title = "Grilled Chicken",
            ingredients = listOf(
                "1 chicken breast",
                "Olive oil",
                "Garlic",
                "Lemon juice",
                "Salt",
                "Pepper"
            ),
            steps = listOf(
                "Marinate chicken with ingredients for 30 minutes.",
                "Grill for 6–8 minutes per side until cooked through."
            )
        ),
        Recipe(
            id = 41,
            title = "Berry Parfait",
            ingredients = listOf(
                "Yogurt",
                "Granola",
                "Mixed berries",
                "Honey"
            ),
            steps = listOf(
                "Layer yogurt, berries, and granola in a glass.",
                "Drizzle honey on top before serving."
            )
        ),
        Recipe(
            id = 42,
            title = "Avocado Smoothie",
            ingredients = listOf(
                "1 avocado",
                "1 cup milk",
                "1 tbsp honey",
                "Ice cubes"
            ),
            steps = listOf(
                "Blend all ingredients until smooth and creamy."
            )
        ),
        Recipe(
            id = 43,
            title = "Peanut Butter Cookies",
            ingredients = listOf(
                "1 cup peanut butter",
                "1 cup sugar",
                "1 egg"),
            steps = listOf(
                "Mix all ingredients together.",
                "Scoop onto a baking tray and bake at 350°F for 10 minutes."
            )
        ),
        Recipe(
            id = 44,
            title = "Tuna Sandwich",
            ingredients = listOf(
                "Bread",
                "Tuna",
                "Mayonnaise",
                "Lettuce"
            ),
            steps = listOf(
                "Mix tuna with mayo and spread on bread with lettuce."
            )
        ),
        Recipe(
            id = 45,
            title = "Apple Pie",
            ingredients = listOf(
                "2 apples",
                "Pie crust",
                "Sugar",
                "Cinnamon"
            ),
            steps = listOf(
                "Slice apples and toss with sugar and cinnamon.",
                "Fill crust and bake at 375°F for 40 minutes."
            )
        ),
        Recipe(
            id = 46,
            title = "Vanilla Cupcakes",
            ingredients = listOf(
                "1 cup flour",
                "1/2 cup sugar",
                "1/2 cup butter",
                "1 egg",
                "1 tsp vanilla"
            ),
            steps = listOf(
                "Preheat oven to 350°F.",
                "Mix ingredients and bake for 18 minutes."
            )
        ),
        Recipe(
            id = 47,
            title = "Tomato Bruschetta",
            ingredients = listOf(
                "Bread",
                "Tomatoes",
                "Garlic",
                "Basil",
                "Olive oil"
            ),
            steps = listOf(
                "Toast bread and top with diced tomatoes, garlic, basil, and olive oil."
            )
        ),
        Recipe(
            id = 48,
            title = "Cinnamon Oatmeal",
            ingredients = listOf(
                "1 cup oats",
                "2 cups milk",
                "1 tsp cinnamon",
                "Honey"),
            steps = listOf(
                "Cook oats in milk until thickened.",
                "Stir in cinnamon and drizzle with honey."
            )
        ),
        Recipe(
            id = 49,
            title = "Lentil Soup",
            ingredients = listOf(
                "1 cup lentils",
                "1 onion",
                "2 carrots",
                "4 cups broth"
            ),
            steps = listOf(
                "Sauté onion and carrots, then add lentils and broth.",
                "Simmer for 25 minutes until soft."
            )
        ),
        Recipe(
            id = 50,
            title = "Peach Smoothie",
            ingredients = listOf(
                "1 peach",
                "1 banana",
                "1 cup milk",
                "Ice cubes"
            ),
            steps = listOf(
                "Blend all ingredients until smooth."
            )
        ),
    )
    //Sort By alphabet by name of Recipe
        .sortedBy { it.title }
}
