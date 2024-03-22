package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */


fun main() {

    val circle = Circle(radius = RADIUS)
    circle.changeName("Circle is now Oval")
    println(circle.name)

    println()

    val rectangle = Rectangle(length = LENGTH, breadth = BREADTH)
    rectangle.changeName("Rectangle is now Circle")
    println(rectangle.name)

    println()

    val triangle = Triangle(a = a, b = b, c = c)
    triangle.changeName("Triangle is now Square")
    println(triangle.name)
}

private const val RADIUS = 2.0
private const val LENGTH = 5.0
private const val BREADTH = 10.0
private const val a = 10.0
private const val b = 10.0
private const val c = 10.0