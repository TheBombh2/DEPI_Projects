package com.example.foodapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.foodapplication.databinding.FragmentMealPlansBinding


class MealsPlansFragment: Fragment() {
    lateinit var binding:FragmentMealPlansBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMealPlansBinding.inflate(inflater,container,false)


        return binding.root

    }
}