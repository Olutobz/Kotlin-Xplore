package main.practice.tutorials

import kotlin.random.Random

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 March 2024
 * EMAIL: damexxey94@gmail.com
 */

fun main() {
    val max = getMax(Random.nextInt(1, 20))
    println("The maximum is $max")

    searchFor("How to become a good programmer")
    searchFor(searchEngine = "Google", search = "How to improve my kotlin skills")
}

private fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) max = number
    }
    return max
}

private fun searchFor(search: String, searchEngine: String = "Google") {
    println("Searching for $search on $searchEngine")
}