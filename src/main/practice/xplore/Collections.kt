package main.practice.xplore

/**
 * Created by Damola Olutoba Onikoyi
 * DATE: 10, October 2025
 * EMAIL: damexxey94@gmail.com
 */

val arrayOfCitiesInCalifornia = arrayOf("San Francisco", "San Jose", "San Diego", "Los Angeles", "Palo Alto")
val arrayOfStatesInTheUS = arrayOf("California", "New York", "New Hampshire", "Texas", "Arkansas", "Arizona")
val arrayOfStatesAndCities = arrayOfStatesInTheUS + arrayOfCitiesInCalifornia

val listOfCitiesInCalifornia = listOf("San Francisco", "San Jose", "San Diego", "Los Angeles", "Palo Alto")
val listOfStatesInTheUS = listOf("California", "New York", "New Hampshire", "Texas", "Arkansas", "Arizona")

fun main() {
    println(arrayOfStatesAndCities.contentToString())
    println(listOfCitiesInCalifornia.indexOf("San Jose"))

    for (city in listOfCitiesInCalifornia) {
        println(city)
    }

    for (stateUS in listOfStatesInTheUS) {
        println(stateUS)
    }
}
