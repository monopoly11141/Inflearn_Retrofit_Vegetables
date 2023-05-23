package com.example.inflearn_retrofit_vegetables

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.inflearn_retrofit_vegetables.adapter.PlantAdapter
import com.example.inflearn_retrofit_vegetables.databinding.ActivityMainBinding
import com.example.inflearn_retrofit_vegetables.viewModel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel: MainActivityViewModel by viewModels()

        viewModel.getAllData()

        val rvPlant = binding.rvPlant

        viewModel.allPlants.observe(this, Observer { plantList ->

            val plantAdapter = PlantAdapter(this, plantList)
            rvPlant.adapter = plantAdapter
            rvPlant.layoutManager = LinearLayoutManager(this)



        })
    }
}