package com.example.new_elec_car_company.loadModel


import com.google.gson.annotations.SerializedName

data class Route(
    @SerializedName("traoptimal")
    val traoptimal: List<Traoptimal>?
)