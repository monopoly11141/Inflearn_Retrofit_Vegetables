package com.example.inflearn_retrofit_vegetables.repository

import com.example.inflearn_retrofit_vegetables.api.PlantsApi
import com.example.inflearn_retrofit_vegetables.api.RetrofitInstance
import com.example.inflearn_retrofit_vegetables.model.Plant

class Repository {

    private val client = RetrofitInstance.getInstance().create(PlantsApi::class.java)

    suspend fun getAllPlants() = client.getAllPlants()
}