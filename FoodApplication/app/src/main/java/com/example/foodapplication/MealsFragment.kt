package com.example.foodapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodapplication.MealsFragmentDirections
import com.example.foodapplication.databinding.FragmentMealsBinding

class MealsFragment: Fragment(), MealItemAdapter.MealClickListner {
    lateinit var binding:FragmentMealsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMealsBinding.inflate(inflater,container,false)
        val meals = mutableListOf(
            Meal("Burger", R.drawable.burger),
            Meal("Steak",R.drawable.filletsteak),
            Meal("Pancakes",R.drawable.pancakes),
            Meal("Pizza",R.drawable.pizza),
            Meal("Shawerma",R.drawable.shawerma),
            Meal("Waffels",R.drawable.waffles),
        )
        val mealsListAdapter = MealItemAdapter(meals,this)
        binding.rvMeals.adapter = mealsListAdapter



        return binding.root
    }

    override fun onMealClicked(meal: Meal) {
        val action = MealsFragmentDirections.actionMealsFragmentToMealDetailsFragment(meal)
        findNavController().navigate(action)
    }


}