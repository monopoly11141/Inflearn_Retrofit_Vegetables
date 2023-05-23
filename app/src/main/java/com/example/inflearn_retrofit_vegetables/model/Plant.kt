package com.example.inflearn_retrofit_vegetables.model


import com.google.gson.annotations.SerializedName

data class Plant(
    @SerializedName("description")
    val description: String,
    @SerializedName("growZoneNumber")
    val growZoneNumber: Int,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("plantId")
    val plantId: String,
    @SerializedName("wateringInterval")
    val wateringInterval: Int
)