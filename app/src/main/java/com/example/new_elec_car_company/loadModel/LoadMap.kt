package com.example.new_elec_car_company.loadModel


import com.google.gson.annotations.SerializedName

data class LoadMap(
    @SerializedName("code")
    val code: Int?,
    @SerializedName("currentDateTime")
    val currentDateTime: String?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("route")
    val route: Route?
)