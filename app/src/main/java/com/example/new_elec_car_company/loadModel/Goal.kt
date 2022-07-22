package com.example.new_elec_car_company.loadModel


import com.google.gson.annotations.SerializedName

data class Goal(
    @SerializedName("dir")
    val dir: Int?,
    @SerializedName("location")
    val location: List<Double>?
)