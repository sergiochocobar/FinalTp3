package com.example.finaltp3.providers

import com.example.finaltp3.R
import com.example.finaltp3.entities.RestaurantsListModel

class RestaurantsListProvider {
    companion object{
        val restaurantsList = listOf<RestaurantsListModel>(
            RestaurantsListModel(
                "Big Mouth Burgers",
                "American food",
                "4.6",
                R.drawable.card_one),

            RestaurantsListModel(
                "Pizzeria La Farola",
                "Pizza",
                "4.8",
                R.drawable.card_two),

            RestaurantsListModel(
                "Sushi Me",
                "Japanese food",
                "4.4",
                R.drawable.card_three),
        )
    }
}