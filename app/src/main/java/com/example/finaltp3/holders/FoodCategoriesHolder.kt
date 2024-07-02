package com.example.finaltp3.holders

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.finaltp3.R
import com.example.finaltp3.entities.FoodCategoriesModel

//class FoodCategoriesHolder (view: View) : RecyclerView.ViewHolder(view)  {
//
//    val title = view.findViewById<TextView>(R.id.menu_item_text)
//    val image = view.findViewById<ImageView>(R.id.menu_item_icon)
//
//
//    fun render(model: FoodCategoriesModel){
//        title.text = model.title
//        Glide.with(image.context).load(model.imageResId).into(image)
//    }
//}

class FoodCategoriesHolder(view: View) : RecyclerView.ViewHolder(view) {

    val title = view.findViewById<TextView>(R.id.menu_item_text)
    val image = view.findViewById<ImageView>(R.id.menu_item_icon)
    val background = view.findViewById<LinearLayout>(R.id.food_categorie_item) // Assuming this is the root layout in your item

    fun render(model: FoodCategoriesModel) {
        title.text = model.title
        Glide.with(image.context).load(model.imageResId).into(image)

        if (model.imageResId != 0) {
            image.visibility = View.VISIBLE
            Glide.with(image.context).load(model.imageResId).into(image)
        } else {
            image.visibility = View.GONE
        }

        // Cambiar color de fondo y texto según el estado de selección
        if (model.isSelected) {
            background.setBackgroundResource(R.drawable.rounded_background)
            title.setTextColor(ContextCompat.getColor(title.context, R.color.white))
        } else {
            background.setBackgroundResource(R.drawable.rounded_background_no_selected)
            title.setTextColor(ContextCompat.getColor(title.context, R.color.black))
        }
    }
}