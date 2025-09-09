package main.practice.xplore

import kotlin.math.sqrt
import kotlin.random.Random

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */

abstract class Shape(var name: String) {

    constructor(name: String, vararg dimension: Double) : this(name)

    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        name = newName
    }

}

class Circle(
    private val radius: Double
) : Shape(ShapeType.CIRCLE.name) {

    init {
        if (radius < 0.0) throw CustomException.NegativeRadiusException()
        println("$name created with radius = $radius")
        println("$name area is = ${area()}")
        println("$name perimeter is = ${perimeter()}")
    }

    override fun area() = Math.PI * radius * radius

    override fun perimeter() = 2 * Math.PI * radius

    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 20.0)
            return Circle(radius)
        }
    }

}

class Triangle(
    private val a: Double,
    private val b: Double,
    private val c: Double,
) : Shape(name = ShapeType.TRIANGLE.name) {

    init {
        println("$name created with sides, a = $a, b = $b, c = $c")
        println("$name area is = ${area()}")
        println("$name perimeter is = ${perimeter()}")
    }

    override fun area(): Double {
        val res = (perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - c)
        return sqrt(res)
    }

    override fun perimeter() = a + b + c

}

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