package com.example.recipebookapp.data

data class Recipe(
    val id: Int,
    val title: String,
    val ingredients: List<String>,
    val steps: List<String>,
    val difficulty: Int,
    val country: String
)
