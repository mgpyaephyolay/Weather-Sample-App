package com.example.weatherwidget.model.remote.data_forecast

data class Forecast(

    val dt: Int,
    val main: Main,
    val weather: List<Weather>
)