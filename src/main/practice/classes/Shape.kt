package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */

open class Shape(
    var name: String
) {

    init {
        println("I am the supper class")
    }

    fun changeName(newName: String) {
        name = newName
    }

}