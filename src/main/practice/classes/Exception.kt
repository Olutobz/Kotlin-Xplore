package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 12 April 2024
 * EMAIL: damexxey94@gmail.com
 */

fun main() {

    val division = try {
        println(divide(2.3, 0.0))
    } catch (e: DivisionByZeroException) {
        println(e.message)
        0.0
    }

    println("The result of the division is $division")

}

fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw DivisionByZeroException()
    }
    return a / b
}

class DivisionByZeroException : Exception("You cannot divide by zero, Please choose a different number")
