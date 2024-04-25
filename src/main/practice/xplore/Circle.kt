package main.practice.xplore

import kotlin.random.Random

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */
class Circle(private val radius: Double) : Shape(ShapeType.CIRCLE.name) {

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
            return Circle(Random.nextDouble(1.0, 20.0))
        }
    }

}
