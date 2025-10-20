package com.example.recipebookapp.vm

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.example.recipebookapp.data.FakeRecipe
import com.example.recipebookapp.data.Recipe


class RecipeViewModel : ViewModel() {

    //Taking all from FakeRecipe.kt
    var recipes by mutableStateOf(FakeRecipe.all)
        private set

    //Storing favorites recipe IDs
    var favoriteIds by mutableStateOf(setOf<Int>())
        private set

    //ToggleFavorite List
    fun toggleFavorite(id: Int){
        favoriteIds = if (id in favoriteIds) favoriteIds - id else favoriteIds + id
    }

    fun isFavorite(id : Int): Boolean = id in favoriteIds

    fun getRecipe(id: Int): Recipe? = recipes.find {it.id == id }

}