package main.practice.xplore

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */
class Rectangle(
    private val length: Double,
    private val breadth: Double,
) : Shape(ShapeType.RECTANGLE.name) {

    constructor(a: Double) : this(a, a)
    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

    init {
        println("$name created with length of $length and breadth of $breadth")
        println("$name area = ${area()}")
        println("$name isSquare? = ${isSquare()}")
        println("$name perimeter is = ${perimeter()}")
    }

    override fun area(): Double = length * breadth

    override fun perimeter(): Double = 2 * (length.plus(breadth))

    private fun isSquare() = length == breadth

}