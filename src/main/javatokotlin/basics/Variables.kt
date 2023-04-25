package main.javatokotlin.basics

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 27 November 2023
 * EMAIL: damexxey94@gmail.com
 */

class Variables {

    private val firstName : String = "Damola"
    private val middleName  = "Olutoba"
    private val lastName = "Onikoyi"
    val fullName = "My name is $firstName $middleName $lastName"


    private val str = "Java to kotlin Guide"
    var substr = str.substring(0..4)

}