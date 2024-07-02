package com.example.finaltp3.entities

data class FoodCategoriesModel(
    val title: String,
    val imageResId: Int,
    var isSelected: Boolean = false
)