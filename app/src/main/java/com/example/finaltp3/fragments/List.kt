package com.example.finaltp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finaltp3.databinding.FragmentListBinding

import com.example.finaltp3.adapters.FoodCategoriesAdapter
import com.example.finaltp3.adapters.RestaurantsListAdapter
import com.example.finaltp3.providers.FoodCategoriesProvider
import com.example.finaltp3.providers.RestaurantsListProvider

class List : Fragment() {
    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!
    private lateinit var foodCategoriesAdapter: FoodCategoriesAdapter
    private lateinit var restaurantsAdapter: RestaurantsListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)

        // Configurar el adaptador para las categorías de comida
        foodCategoriesAdapter = FoodCategoriesAdapter(FoodCategoriesProvider.foodCategoriesList) { selectedCategory ->
            // Maneja la lógica cuando se selecciona una categoría
        }
        binding.foodCategoriesRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.foodCategoriesRecycler.adapter = foodCategoriesAdapter

        // Configurar el adaptador para la lista de restaurantes
        restaurantsAdapter = RestaurantsListAdapter(RestaurantsListProvider.restaurantsList) { selectedRestaurant ->
            // Maneja la lógica cuando se selecciona un restaurante
        }
        binding.restaurantsListRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.restaurantsListRecycler.adapter = restaurantsAdapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}