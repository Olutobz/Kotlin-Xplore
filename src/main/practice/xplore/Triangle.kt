package main.practice.xplore

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
) : Shape(ShapeType.TRIANGLE.name) {

    init {
        println("$name created with sides, a = $a, b = $b, c = $c")
        println("$name area is = ${area()}")
        println("$name perimeter is = ${perimeter()}")
    }

    override fun area() = sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - c))

    override fun perimeter() = a + b + c

}