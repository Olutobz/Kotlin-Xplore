package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 07 April 2024
 * EMAIL: damexxey94@gmail.com
 */

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    println("Initial list: $list")
    alternateNumbers(list)
    println()

    val array = arrayOf(1, 2, 3, 4, 5, 6)
    print("Initial array: ${array.contentToString()}\n")
    alternateNumbers(array)
    println()

    val boy = Person()
    boy.actualAge = 27
    boy.age = 45
    println("Toba: actual age = ${boy.actualAge}")
    println("Toba: pretended age = ${boy.age}")

}

private fun alternateNumbers(list: List<Int>) {
    var start = 0
    var end = list.size - 1
    var toggle = true

    while (start <= end) {
        if (toggle) {
            print("${list[start]} ")
            start++
        } else {
            print("${list[end]} ")
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
            print("${array[start]} ")
            start++
        } else {
            print("${array[end]} ")
            end--
        }
        toggle = !toggle
    }

}