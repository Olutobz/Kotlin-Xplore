package main.practice.classes

import kotlin.math.sqrt

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */
class Triangle(
    private val a: Double,
    private val b: Double,
    private val c: Double,
) {

    init {
        println("Triangle created with radius = $a, b = $b, c = $c")
        println("Triangle area is = ${area()}")
        println("Triangle perimeter is = ${perimeter()}")
    }

    private fun area() = sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - c))

    private fun perimeter() = a + b + c

}