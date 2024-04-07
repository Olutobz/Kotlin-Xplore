package main.practice.classes

import java.util.Arrays

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 07 April 2024
 * EMAIL: damexxey94@gmail.com
 */

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    println("Initial list: $list")
    alternateNumbers(list)

    val array = arrayOf(1, 2, 3, 4, 5, 6)
    println("Initial array: ${array.contentToString()}")
    alternateNumbers(array)

}

private fun alternateNumbers(list: List<Int>) {
    var start = 0
    var end = list.size - 1
    var toggle = true

    while (start <= end) {
        if (toggle) {
            println(list[start])
            start++
        } else {
            println(list[end])
            end--
        }
        toggle = !toggle
    }

}

private fun alternateNumbers(array: Array<Int>) {
    var start = 0
    var end = array.size - 1
    var toggle = true

    while (start <= end) {
        if (toggle) {
            println(array[start])
            start++
        } else {
            println(array[end])
            end--
        }
        toggle = !toggle
    }

}