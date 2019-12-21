package com.brfdeveloper.countries.model.API

import com.brfdeveloper.countries.model.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountriesApi {

    @GET("DevTides/countries/master/countriesV2.json")
    fun getCountries() : Single<List<Country>>
}