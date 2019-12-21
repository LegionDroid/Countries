package com.brfdeveloper.countries.model.API

import com.brfdeveloper.countries.di.DaggerApiComponent
import com.brfdeveloper.countries.model.Country
import io.reactivex.Single
import javax.inject.Inject

class CountriesService{

    @Inject
    lateinit var api: CountriesApi


    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }
}