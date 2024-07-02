package com.example.finaltp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.finaltp3.databinding.FragmentDetailBinding
import com.example.finaltp3.entities.RestaurantsListModel
import com.example.finaltp3.utils.serializable

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)

        // Obtener los argumentos pasados al fragmento
        val restaurant = arguments?.serializable<RestaurantsListModel>("restaurant")

        // Configurar la vista con los datos del restaurante
        if (restaurant != null) {
            binding.restaurantTitle.text = restaurant.title
            binding.restaurantAddress.text = restaurant.subtitle
            // Usa Glide para cargar la imagen si es necesario
            Glide.with(this).load(restaurant.imageResId).into(binding.restaurantImage)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    private var _binding: FragmentDetailBinding? = null
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding = FragmentDetailBinding.inflate(inflater, container, false)
//
//        // Obtener los argumentos pasados al fragmento usando Safe Args
//        val args: DetailFragmentArgs by navArgs()
//        val restaurant = args.restaurant
//
//        // Configurar la vista con los datos del restaurante
//        binding.restaurantTitle.text = restaurant.title
//        binding.restaurantSubtitle.text = restaurant.subtitle
//        binding.restaurantQualification.text = restaurant.qualification
//        // Usa Glide para cargar la imagen si es necesario
//        Glide.with(this).load(restaurant.imageResId).into(binding.restaurantImage)
//
//        return binding.root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
}


