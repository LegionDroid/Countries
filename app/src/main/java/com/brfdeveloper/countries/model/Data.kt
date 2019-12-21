package com.brfdeveloper.countries.model

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("name")
    val countryName: String?,
    @SerializedName("capital")
    val Capital: String?,
    @SerializedName("flagPNG")
    val flag: String?
)

data class Mundo(val planeta: String)