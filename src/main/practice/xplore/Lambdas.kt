package main.practice.xplore

import kotlin.random.Random

/**
 * Created by Damola Olutoba Onikoyi
 * DATE: 08, August 2025
 * EMAIL: damexxey94@gmail.com
 */

fun main() {

    val trickCount: (Int) -> String = {
        "Would trick you $it times"
    }

    val trickFunction = trickOrTreat(isTrick = true, extraTreat = trickCount)
    val treatFunction = trickOrTreat(isTrick = false) { "Take $it cupcakes!" }
    trickFunction()

    repeat(5) {
        treatFunction()
    }
}

val trick = {
    println("No treats! I'll trick you instead.")
}

val treat = {
    println("Thank you, have a treat!")
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    return if (isTrick) trick
    else {
        val num = Random.nextInt(1, 101)
        if (extraTreat != null) {
            println(extraTreat(num))
        }
        treat
    }
}
