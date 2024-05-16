package com.ardent.wthr.models

import com.google.gson.annotations.SerializedName

data class HourlyForecast(
    @SerializedName("Date")
    val date:String,
    @SerializedName("EpochDateTime")
    val epochdatetime:Long,
    @SerializedName("WeatherIcon")
    val weatherIcon:Int,
    @SerializedName("IconPhrase")
    val iconPhrase:String,
    @SerializedName("HasPrecipitation")
    val HasPrecipitation:Boolean,
    @SerializedName("isDayLight")
    val isDayLight:Boolean,
    @SerializedName("Temperature")
    val temperature: Value
)
