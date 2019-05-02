package uk.co.tandem.weather.model

data class Forecast(val dt: Long,
                    val main: Main,
                    val weather: List<Weather>)
