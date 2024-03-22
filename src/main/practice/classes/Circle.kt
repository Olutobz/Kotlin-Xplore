package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */
class Circle(
    private val radius: Double
) : Shape(ShapeTypes.CIRCLE.name) {

    init {
        println("$shapeType created with radius = $radius")
        println("$shapeType area is = ${area()}")
        println("$shapeType perimeter is = ${perimeter()}")
    }

    override fun area() = Math.PI * radius * radius

    override fun perimeter() = 2 * Math.PI * radius

}