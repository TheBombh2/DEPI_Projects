package com.example.foodapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapplication.databinding.MealItemBinding

class MealItemAdapter(val meals: List<Meal>,val mealClickListner: MealClickListner) :
    ListAdapter<Meal, MealItemAdapter.MealViewHolder>(MealItemDiffCallback()) {


    class MealViewHolder(val itemMealBinding: MealItemBinding) :
        RecyclerView.ViewHolder(itemMealBinding.root) {

    }

    interface MealClickListner{
        fun onMealClicked(meal:Meal)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val bindng = MealItemBinding.inflate(inflater, parent, false)
        return MealViewHolder(bindng)
    }

    override fun getItemCount(): Int {
        return meals.size
    }

    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {
        val meal = meals[position]
        holder.itemMealBinding.meal = meal
        holder.itemMealBinding.headerImage.setImageResource(meal.img)
        holder.itemMealBinding.root.setOnClickListener{
            mealClickListner.onMealClicked(meal)
        }

    }

}


class MealItemDiffCallback : DiffUtil.ItemCallback<Meal>() {
    override fun areItemsTheSame(oldItem: Meal, newItem: Meal): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Meal, newItem: Meal): Boolean {
        return oldItem == newItem
    }

}