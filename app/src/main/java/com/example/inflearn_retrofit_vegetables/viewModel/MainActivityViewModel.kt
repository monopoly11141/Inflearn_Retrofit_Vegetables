package com.example.inflearn_retrofit_vegetables.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.inflearn_retrofit_vegetables.api.PlantsApi
import com.example.inflearn_retrofit_vegetables.api.RetrofitInstance
import com.example.inflearn_retrofit_vegetables.model.Plant
import com.example.inflearn_retrofit_vegetables.repository.Repository
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    private val TAG = this.javaClass.simpleName

    private val repository = Repository()

    private val _allPlants = MutableLiveData<List<Plant>>()
    val allPlants : LiveData<List<Plant>>
        get() = _allPlants

    fun getAllData() = viewModelScope.launch{
        _allPlants.value = repository.getAllPlants()
    }
}