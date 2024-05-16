package com.ardent.wthr.repositories

import com.ardent.wthr.models.BaseModel
import com.ardent.wthr.models.DailyForecasts
import com.ardent.wthr.models.HourlyForecast
import com.ardent.wthr.models.Location

interface WeatherRepositories {
    suspend fun searchLocation(query: String):BaseModel<List<Location>>
    suspend fun getDailyForecasts(locationkey:String):BaseModel<DailyForecasts>
    suspend fun getHourlyForecasts(locationkey: String): BaseModel<List<HourlyForecast>>
}