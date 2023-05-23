package com.example.inflearn_retrofit_vegetables.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.inflearn_retrofit_vegetables.R
import com.example.inflearn_retrofit_vegetables.databinding.PlantItemBinding
import com.example.inflearn_retrofit_vegetables.model.Plant


class PlantAdapter(private val context : Context, private val plant: List<Plant>) : RecyclerView.Adapter<PlantAdapter.ViewHolder>() {


    private lateinit var binding: PlantItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantAdapter.ViewHolder {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.plant_item, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return plant.size
    }

    override fun onBindViewHolder(holder: PlantAdapter.ViewHolder, position: Int) {
        holder.bind(plant[position])
    }

    inner class ViewHolder(binding: PlantItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(plant: Plant) {
            Glide.with(context).load(plant.imageUrl).into(binding.ivPlant)
            binding.tvPlantName.text = plant.name
        }
    }
}