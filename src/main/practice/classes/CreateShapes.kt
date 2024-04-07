package main.practice.classes

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
private const val b = 10.0
private const val c = 10.0

fun main() {

    val circle = Circle(radius = RADIUS)
    circle.changeTypeName("Oval")
    println("New name of shape = ${circle.shapeType}\n")

    val rectangle = Rectangle(length = LENGTH, breadth = BREADTH)
    rectangle.changeTypeName("Circle")
    println("New name of shape = ${rectangle.shapeType}\n")

    val rectangleInt = Rectangle(a = LENGTH_INT, b = BREADTH_INT)
    println("New name of shape = ${rectangleInt.shapeType}\n")


    val triangle = Triangle(a = a, b = b, c = c)
    val maxAreaTriangleAndCircle = maxArea(circle, triangle)
    val maxAreaRectCircleTriangle = maxArea(circle, triangle, rectangle)
    println("The max area of 2 shapes = $maxAreaTriangleAndCircle")
    println("The max area of 3 shapes = $maxAreaRectCircleTriangle")

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
