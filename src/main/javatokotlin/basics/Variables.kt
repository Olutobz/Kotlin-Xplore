package main.javatokotlin.basics

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 27 November 2023
 * EMAIL: damexxey94@gmail.com
 */

class Variables {
    private val firstName: String = "Damola"
    private val middleName = "Olutoba"
    private val lastName = "Onikoyi"
    private val fullName = "My name is $firstName $middleName $lastName"
    private val shorterName = "Name is ${firstName.substring(2)}"

    private val someText = "Java to kotlin Guide"
    private var substr = someText.substring(0..4)
    private val textSize = someText.length

    fun main() {
        println(fullName)
        println(shorterName)
        println(substr)
        println(textSize)
    }
}