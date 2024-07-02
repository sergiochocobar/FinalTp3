package com.example.finaltp3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finaltp3.R
import com.example.finaltp3.entities.FoodCategoriesModel
import com.example.finaltp3.holders.FoodCategoriesHolder
import com.google.android.material.chip.Chip


//class FoodCategoriesAdapter (private val foodCateogoriesList: List<FoodCategoriesModel>) : RecyclerView.Adapter<FoodCategoriesHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodCategoriesHolder {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        return FoodCategoriesHolder(layoutInflater.inflate(R.layout.food_categorie_item, parent, false))
//    }
//    override fun getItemCount(): Int = foodCateogoriesList.size
//
//    override fun onBindViewHolder(holder: FoodCategoriesHolder, position: Int) {
//        val bestDestination = foodCateogoriesList[position]
//        holder.render(bestDestination)
//    }
//}


class FoodCategoriesAdapter(
    private val foodCategoriesList: List<FoodCategoriesModel>,
    private val onItemClick: (FoodCategoriesModel) -> Unit
) : RecyclerView.Adapter<FoodCategoriesHolder>() {

    private var selectedPosition: Int = RecyclerView.NO_POSITION

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodCategoriesHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FoodCategoriesHolder(layoutInflater.inflate(R.layout.food_categorie_item, parent, false))
    }

    override fun getItemCount(): Int = foodCategoriesList.size

    override fun onBindViewHolder(holder: FoodCategoriesHolder, position: Int) {
        val category = foodCategoriesList[position]
        holder.render(category)

        // Ajustar el paddingStart del primer ítem
        val layoutParams = holder.title.layoutParams as ViewGroup.MarginLayoutParams
        if (position == 0) {
            layoutParams.marginStart = 0
        }

        holder.itemView.setOnClickListener {
            val previousSelectedPosition = selectedPosition
            selectedPosition = holder.adapterPosition

            if (previousSelectedPosition != RecyclerView.NO_POSITION) {
                notifyItemChanged(previousSelectedPosition)
            }
            notifyItemChanged(selectedPosition)

            foodCategoriesList.forEach { it.isSelected = false }
            category.isSelected = true

            onItemClick(category)
        }
    }
}