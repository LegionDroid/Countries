package com.brfdeveloper.countries.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.brfdeveloper.countries.model.Country

class ListViewModel: ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh(){
        fetchData()
    }

    private fun fetchData() {
        val mockData = listOf(
            Country("CountryA"),
            Country("CountryB"),
            Country("CountryC"),
            Country("CountryD"),
            Country("CountryE"),
            Country("CountryF"),
            Country("CountryG"),
            Country("CountryH"),
            Country("CountryI")
            )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }

}