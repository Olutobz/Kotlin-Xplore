package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */
class Rectangle(
    private val length: Double,
    private val breadth: Double,
) : Shape("Rectangle") {

    init {
        println("$name created with length of $length and breadth of $breadth")
        println("$name area = ${area()}")
        println("$name isSquare? = ${isSquare()}")
        println("$name perimeter is = ${perimeter()}")
    }

    private fun area() = length * breadth

    private fun perimeter() = 2 * (length.plus(breadth))

    private fun isSquare() = length == breadth

}