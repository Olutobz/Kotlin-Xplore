package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */
class Circle(
    private val radius: Double
) : Shape("Circle") {

    init {
        println("$name created with radius = $radius")
        println("$name area is = ${area()}")
        println("$name perimeter is = ${perimeter()}")
    }

    private fun area() = Math.PI * radius * radius

    private fun perimeter() = 2 * Math.PI * radius

}