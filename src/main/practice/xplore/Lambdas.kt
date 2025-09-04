package main.practice.xplore

import kotlin.random.Random

/**
 * Created by Damola Olutoba Onikoyi
 * DATE: 08, August 2025
 * EMAIL: damexxey94@gmail.com
 */

fun main() {

    var treatCount = 0
    var trickCount = 0

    val trickFunction = trickOrTreat(isTrick = true) {
        trickCount = it
        "Preparing to trick you $it times"
    }
    repeat(trickCount) {
        trickFunction()
    }
    println()

    val treatFunction = trickOrTreat(isTrick = false) {
        treatCount = it
        "Take $it cupcakes, and enjoy your treats!"
    }
    repeat(treatCount) {
        treatFunction()
    }
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
