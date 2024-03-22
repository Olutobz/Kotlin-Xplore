package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */

private const val RADIUS = 2.0
private const val LENGTH = 5.0
private const val BREADTH = 10.0
private const val a = 10.0
private const val b = 10.0
private const val c = 10.0

fun main() {

    val circle = Circle(radius = RADIUS)
    circle.changeTypeName("Circle is now named Oval")
    println(circle.shapeType)

    println()

    val rectangle = Rectangle(length = LENGTH, breadth = BREADTH)
    rectangle.changeTypeName("Rectangle is now named Circle")
    println(rectangle.shapeType)

    println()

    val triangle = Triangle(a = a, b = b, c = c)
    triangle.changeTypeName("Triangle is now named Square")
    println(triangle.shapeType)

}