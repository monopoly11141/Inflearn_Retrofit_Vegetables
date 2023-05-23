package com.example.inflearn_retrofit_vegetables.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.inflearn_retrofit_vegetables.api.PlantsApi
import com.example.inflearn_retrofit_vegetables.api.RetrofitInstance
import com.example.inflearn_retrofit_vegetables.model.Plant
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    val TAG = this.javaClass.simpleName

    val retrofitInstance = RetrofitInstance.getInstance().create(PlantsApi::class.java)

    private val _allPlants = MutableLiveData<List<Plant>>()
    val allPlants : LiveData<List<Plant>>
        get() = _allPlants

    fun getAllData() = viewModelScope.launch{
        _allPlants.value = retrofitInstance.getAllPlants()
    }
}