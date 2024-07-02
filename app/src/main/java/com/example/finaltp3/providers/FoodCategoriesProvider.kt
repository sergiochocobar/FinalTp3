package com.example.finaltp3.providers

import com.example.finaltp3.R
import com.example.finaltp3.entities.FoodCategoriesModel


class FoodCategoriesProvider{
    companion object{
        val foodCategoriesList = listOf<FoodCategoriesModel>(
            FoodCategoriesModel(
                "All",
                0),

            FoodCategoriesModel(
                "Pizza",
                R.drawable.pizza_icon),

            FoodCategoriesModel(
                "Burgers",
                R.drawable.hamburger_icon),

            FoodCategoriesModel(
                "Tacos",
                R.drawable.taco_icon),
        )
    }
}