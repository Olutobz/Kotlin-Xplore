package main.practice.test

import main.practice.xplore.Circle
import main.practice.xplore.Rectangle
import main.practice.xplore.Shape
import main.practice.xplore.Triangle

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */

private const val RADIUS = 2.0
private const val LENGTH = 5.0
private const val BREADTH = 10.0
private const val LENGTH_INT = 5
private const val BREADTH_INT = 10
private const val a = 10.0
private var b = 10.0
private var c = 10.0

fun main() {

    val circle = Circle(radius = RADIUS)
    circle.changeName("Oval")
    println("New name of shape = ${circle.name}\n")
    println("Random Circle = ${Circle.randomCircle()}")

    val rectangle = Rectangle(length = LENGTH, breadth = BREADTH)
    rectangle.changeName("Circle")
    println("New name of shape = ${rectangle.name}\n")

    val rectangleInt = Rectangle(a = LENGTH_INT, b = BREADTH_INT)
    println("New name of shape = ${rectangleInt.name}\n")

    val triangle = Triangle(a = a, b = b, c = c)
    val maxAreaTriangleAndCircle = maxArea(circle, triangle)
    val maxAreaRectCircleTriangle = maxArea(circle, triangle, rectangle)
    println("The max area of 2 shapes = $maxAreaTriangleAndCircle")
    println("The max area of 3 shapes = $maxAreaRectCircleTriangle")

    val a1 = 3.0
    val b1 = 4.0
    val height = 5.0

    val parallelogram = object : Shape("Parallelogram", a1, b1, height) {
        init {
            println("\nParallelogram is initialized.")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
            println("Is a Rectangle? ${isRectangle()}")
        }

        override fun area(): Double {
            return a1 * height
        }

        override fun perimeter(): Double {
            return 2 * a1 + 2 * b1
        }

        fun isRectangle(): Boolean = height == perimeter()
    }

}

fun maxArea(shape1: Shape, shape2: Shape): Double {
    val areaSquare1 = shape1.area()
    val areaSquare2 = shape2.area()
    return if (areaSquare1 > areaSquare2) areaSquare1 else areaSquare2
}

fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape): Double {
    val maxAreaOfTwoShapes = maxArea(shape1, shape2)
    val areaSquare3 = shape3.area()
    return if (areaSquare3 > maxAreaOfTwoShapes) areaSquare3 else maxAreaOfTwoShapes
}
