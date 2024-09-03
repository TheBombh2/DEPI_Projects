package com.example.foodapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.foodapplication.databinding.FragmentDetailsMealBinding

class MealDetailsFragment : Fragment() {
    private lateinit var binding : FragmentDetailsMealBinding
    private val args: MealDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsMealBinding.inflate(inflater,container,false)
        val meal = args.meal
        binding.ivFood.setImageResource(meal.img)
        binding.tvFoodName.text = meal.name

        return binding.root
    }
}