package com.brfdeveloper.countries.di

import com.brfdeveloper.countries.model.API.CountriesService
import com.brfdeveloper.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)


}