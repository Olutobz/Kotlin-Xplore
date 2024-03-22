package main.practice.extensions

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 March 2024
 * EMAIL: damexxey94@gmail.com
 */


fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("The product of $list is ${list.products()}")
}

fun List<Int>.products(): Int {
    var result = 1
    for (value in this) {
        result *= value
    }
    return result
}