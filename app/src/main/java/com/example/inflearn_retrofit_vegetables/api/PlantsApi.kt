package com.example.inflearn_retrofit_vegetables.api

import com.example.inflearn_retrofit_vegetables.model.Plant
import retrofit2.http.GET

interface PlantsApi {

    @GET("googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json")
    suspend fun getAllPlants() : List<Plant>
}