package uk.co.tandem.weather

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import uk.co.tandem.weather.model.ForecastResponse

interface OpenWeatherApi {

    @GET("forecast")
    fun getForecast(@Query("q") cityName: String): Single<ForecastResponse>

}
