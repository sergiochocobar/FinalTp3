package com.example.finaltp3.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finaltp3.R
import com.example.finaltp3.entities.RestaurantsListModel
import com.example.finaltp3.holders.RestaurantsListHolder


class RestaurantsListAdapter(
    private val restaurantsList: List<RestaurantsListModel>,
    private val onClick: (RestaurantsListModel) -> Unit
) : RecyclerView.Adapter<RestaurantsListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantsListHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.restaurant_item, parent, false)
        return RestaurantsListHolder(view, onClick)
    }

    override fun getItemCount(): Int = restaurantsList.size

    override fun onBindViewHolder(holder: RestaurantsListHolder, position: Int) {
        val restaurant = restaurantsList[position]
        holder.render(restaurant)
    }
}


