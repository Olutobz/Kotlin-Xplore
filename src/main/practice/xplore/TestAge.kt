package main.practice.xplore

import kotlin.random.Random


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 07 April 2024
 * EMAIL: damexxey94@gmail.com
 */

private const val ZERO_DIVIDER = 0.0

fun main() {
    val listOfAges = listOf(10, 12, 34, 49, 55, 68)
    println("Initial ages: $listOfAges")
    alternateAges(listOfAges)
    println()

    val arrayOfAges = arrayOf(10, 12, 34, 49, 55, 68)
    print("Initial ages: ${arrayOfAges.contentToString()}\n")
    alternateAges(arrayOfAges)
    println()

    val person = Person()
    person.actualAge = 27
    person.age = 29
    println("Toba: actual age = ${person.actualAge}")
    println("Toba: pretended age = ${person.age}")

    val max = Person.getMaxAge(Random.nextInt(13, 80))
    println("The maximum age is $max")

    Person.searchFor("How to become a better developer")
    Person.searchFor(searchEngine = "Bing", searchWord = "Improving my kotlin skills")

    val division = try {
        println(String.format("%.2f", divide(Random.nextDouble(), Random.nextDouble())))
    } catch (e: CustomException.DivisionByZeroException) {
        println(e.message)
        println(e.stackTraceToString())
        ZERO_DIVIDER
    }

    println("The result of the division is $division")

}

private fun divide(a: Double, b: Double) =
    if (b == ZERO_DIVIDER) throw CustomException.DivisionByZeroException() else a / b

private fun alternateAges(list: List<Int>) {
    var start = 0
    var end = list.size - 1
    var toggle = true

    while (start <= end) {
        if (toggle) {
            print("${list[start]} ")
            start++
        } else {
            print("${list[end]} ")
            end--
        }
        toggle = !toggle
    }

}

private fun alternateAges(array: Array<Int>) {
    var start = 0
    var end = array.size - 1
    var toggle = true

    while (start <= end) {
        if (toggle) {
            print("${array[start]} ")
            start++
        } else {
            print("${array[end]} ")
            end--
        }
        toggle = !toggle
    }
}