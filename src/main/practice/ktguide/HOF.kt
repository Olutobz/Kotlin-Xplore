package main.practice.ktguide

import kotlin.math.pow
import kotlin.random.Random

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 01 May 2024
 * EMAIL: damexxey94@gmail.com
 */


fun main() {
    val addTwoNumbers = { x: Int, y: Int -> x + y }
    println(addTwoNumbers(3, 7))

    val sum = calculate(3, 5) { a, b -> a + b }
    println(sum)

    val diff = calculate(5, 2) { a, b -> a - b }
    println(diff)

    val multiply = calculate(4, 9) { a, b -> a * b }
    println(multiply)

    val pow = { base: Int, exponent: Int -> base.toDouble().pow(exponent.toDouble()) }
    println("base^exponent: ${pow(2, 3)}")

    val square = { x: Int -> x * x }
    println(square(3))

    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map { it * it }
    println(doubled)

    val sum2 = numbers.filter { it % 2 == 0 }.reduce { acc, number -> acc + number }
    println(sum2)

    greet { println("Greetings: $it") }

    val doubleItFunction = multiplier(2)
    println(doubleItFunction(5))

    var treatCount = 0
    var trickCount = 0

    val trickFunction = trickOrTreat(isTrick = true) {
        trickCount = it
        "Preparing to trick you $it times"
    }
    println()

    repeat(trickCount) {
        trickFunction()
    }

    val treatFunction = trickOrTreat(isTrick = false) {
        treatCount = it
        "Take $it cupcakes, and enjoy your treats!"
    }

    repeat(treatCount) {
        treatFunction()
    }
}

private fun calculate(
    a: Int,
    b: Int,
    operation: (x: Int, y: Int) -> Int
): Int {
    return operation(a, b)
}

fun greet(action: (String) -> Unit) {
    action("Welcome to San Francisco, Mr Olutoba!")
}

fun multiplier(factor: Int): (Int) -> Int {
    return { x -> x * factor }
}

val trick = {
    println("Sorry No treats! I'll trick you instead.")
}

val treat = {
    println("Thank you, enjoying my treat!")
}

fun trickOrTreat(
    isTrick: Boolean,
    operator: ((Int) -> String)?
): () -> Unit {
    return if (isTrick) {
        val num = Random.nextInt(1, 5)
        if (operator != null) {
            println(operator(num))
        }
        trick
    } else {
        val num = Random.nextInt(1, 5)
        if (operator != null) {
            println(operator(num))
        }
        treat
    }
}
