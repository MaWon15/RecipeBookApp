package com.example.recipebookapp.vm

import androidx.lifecycle.ViewModel
import com.example.recipebookapp.data.FakeRecipe
import com.example.recipebookapp.data.Recipe
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RecipeViewModel : ViewModel() {
    private val _recipes = MutableStateFlow(FakeRecipe.all)
    val recipes: StateFlow<List<Recipe>> = _recipes

    private val _favouriteIds = MutableStateFlow<Set<Int>>(emptySet())
    val favouriteIds: StateFlow<Set<Int>> = _favouriteIds

    fun toggleFavourite(id: Int) {
        _favouriteIds.value = _favouriteIds.value.toMutableSet().also { set ->
            if (!set.add(id)) set.remove(id)
        }
    }
}
