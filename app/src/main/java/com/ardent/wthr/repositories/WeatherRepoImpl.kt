package com.ardent.wthr.repositories

import com.ardent.wthr.network.Api
import com.ardent.wthr.models.BaseModel
import com.ardent.wthr.models.DailyForecasts
import com.ardent.wthr.models.HourlyForecast
import com.ardent.wthr.models.Location
import retrofit2.Response
import java.lang.Exception

class WeatherRepoImpl(private val api:Api):WeatherRepositories {
    override suspend fun searchLocation(query: String): BaseModel<List<Location>> {
        return request {
            api.searchLocation(query=query)
        }
    }
    override suspend fun getDailyForecasts(locationkey: String): BaseModel<DailyForecasts> {
        return request {
            api.getDailyForecasts( locationKey=locationkey)
        }
    }
    override suspend fun getHourlyForecasts(locationkey: String): BaseModel<List<HourlyForecast>> {
        return request {
            api.getHourlyForecast(locationKey = locationkey)
        }
    }
    suspend fun<T> request(request:suspend()->Response<T>): BaseModel<T> {
        try {
            request().also {
                return if(it.isSuccessful){
                    BaseModel.Success(it.body()!!)
                }else{
                    BaseModel.Error(it.errorBody()?.string().toString())
                }
            }
        }
        catch (e:Exception){
            return BaseModel.Error(e.message.toString())
        }
    }
}
