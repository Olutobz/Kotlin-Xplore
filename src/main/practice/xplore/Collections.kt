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
val mutableListOfStatesInTheUS = mutableListOf("California", "New York", "Texas", "Arkansas", "Arizona")

val setOfCitiesInCalifornia = setOf("Sacramento", "San Francisco", "San Jose", "San Diego", "Palo Alto")
val mapOfStatesAndCities = mapOf(
    "California" to "San Francisco",
    "Boston" to "Massachusetts",
    "New York" to "Manhattan",
    "Illinois" to "Chicago",
    "Washington" to "Seattle"
)
val mutableMapOfStatesInTheUS = mutableMapOf(
    "California" to 1,
    "Boston" to 2,
    "New York" to 3,
    "Illinois" to 4,
    "Washington" to 5
)

val mutableListOfSampleInts = mutableListOf(8, 6, 7, 5, 3, 0, 9)

fun main() {
    println(arrayOfStatesAndCities.contentToString())
    println(listOfCitiesInCalifornia.indexOf("San Jose"))
    println(setOfCitiesInCalifornia.contains("San Francisco"))

    for (city in listOfCitiesInCalifornia) {
        println(city)
    }

    listOfStatesInTheUS.forEach { println(it) }

    mutableListOfStatesInTheUS.add("Florida")
    mutableListOfStatesInTheUS.remove("Texas")
    mutableListOfStatesInTheUS[2] = "Kentucky"
    mutableMapOfStatesInTheUS["Florida"] = 6

    mapOfStatesAndCities.forEach {
        println("${it.value} is located in ${it.key}")
    }

    mutableMapOfStatesInTheUS.forEach {
        println("State of ${it.key} has a position value of ${it.value}")
    }

    mutableListOfSampleInts.groupBy { it % 2 }.forEach {
        println("key ${it.key} has values ${it.value} ")
    }

    val event1 = Event(
        title = "Eat breakfast",
        description = "Gain some energy for the day",
        dayPart = DayPart.MORNING,
        duration = 65
    )

    val event2 = Event(
        title = "Eat Lunch",
        description = "Try finishing up for the day",
        dayPart = DayPart.AFTERNOON,
        duration = 70
    )

    val event3 = Event(
        title = "Eat Dinner",
        description = "Get some sleep after",
        dayPart = DayPart.AFTERNOON,
        duration = 30
    )

    val eventsList = mutableListOf(event1, event2, event3)
    val shortEvents = eventsList.filter { it.duration < 60 }
    println("you have ${shortEvents.size} short events")

}
