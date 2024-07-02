package com.example.finaltp3.entities

import java.io.Serializable

data class RestaurantsListModel(
    val title: String,
    val subtitle: String,
    val qualification: String,
    val imageResId: Int
) : Serializable
