package com.example.finaltp3.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.finaltp3.R
import com.example.finaltp3.entities.RestaurantsListModel

class RestaurantsListHolder(view: View, private val onClick: (RestaurantsListModel) -> Unit) : RecyclerView.ViewHolder(view) {

    private val title: TextView = view.findViewById(R.id.restaurant_title)
    private val subtitle: TextView = view.findViewById(R.id.restaurant_subtitle)
    private val qualification: TextView = view.findViewById(R.id.restaurant_qualification)
    private val image: ImageView = view.findViewById(R.id.restaurant_image)

    fun render(model: RestaurantsListModel) {
        title.text = model.title
        subtitle.text = model.subtitle
        qualification.text = model.qualification
        Glide.with(image.context).load(model.imageResId).into(image)

        itemView.setOnClickListener {
            onClick(model)
        }
    }
}