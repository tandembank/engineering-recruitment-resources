package uk.co.tandem.weather.model

data class City(val id: Int,
                val name: String,
                val coord: Coordinates,
                var country: String? = null)

