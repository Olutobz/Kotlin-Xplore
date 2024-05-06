package main.practice.ktguide

import kotlin.math.pow

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 01 May 2024
 * EMAIL: damexxey94@gmail.com
 */


private fun main() {
    val addTwoNumbers = { x: Int, y: Int -> x + y }
    println(addTwoNumbers(3, 7))

    val sum = calculate(3, 5) { a, b -> a + b }
    val diff = calculate(5, 2) { a, b -> a - b }
    val multiply = calculate(4, 9) { a, b -> a * b }
    val pow = { base: Int, exponent: Int -> base.toDouble().pow(exponent.toDouble()) }
    println(sum)
    println(diff)
    println(multiply)
    println("base^exponent: ${pow(2, 3)}")

    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNums = numbers.map { it * it }
    println(squaredNums)

    val sum2 = numbers.filter { it % 2 == 0 }.reduce { acc, number -> acc + number }
    println(sum2)

}

private fun calculate(a: Int, b: Int, operation: (x: Int, y: Int) -> Int): Int {
    return operation(a, b)
}