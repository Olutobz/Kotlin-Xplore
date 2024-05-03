package main.practice.xplore

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 03 May 2024
 * EMAIL: damexxey94@gmail.com
 */

sealed class CustomShape {
    class Circle(val radius: Int) : CustomShape()
    class Square(val sideLength: Int) : CustomShape()

    fun size(shape: CustomShape): Int {
        return when (shape) {
            is Circle -> shape.radius
            is Square -> shape.sideLength
        }
    }
}