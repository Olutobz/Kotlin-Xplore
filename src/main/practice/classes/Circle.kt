package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */
class Circle(
    private val radius: Double
) {

    init {
        println("Circle created with radius = $radius")
        println("Circle area is = ${area()}")
        println("Circle perimeter is = ${perimeter()}")
    }

    private fun area() = Math.PI * radius * radius

    private fun perimeter() = 2 * Math.PI * radius

}