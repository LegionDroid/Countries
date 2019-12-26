package com.brfdeveloper.countries.model.API

import com.brfdeveloper.countries.model.Country
import io.reactivex.Single

interface ICountriesService {

    fun getCountries(): Single<List<Country>>

}