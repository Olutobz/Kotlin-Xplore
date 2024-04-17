package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 15 April 2024
 * EMAIL: damexxey94@gmail.com
 */
class CustomTriple<A : Any, B : Any, C : Any>(
    private var first: A,
    private var second: B,
    private var third: C
) {

    fun printTypes() {
        println("First: ${first::class}")
        println("Second: ${second::class}")
        println("Third: ${third::class}")
    }
}