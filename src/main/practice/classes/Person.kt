package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 10 April 2024
 * EMAIL: damexxey94@gmail.com
 */
class Person {
    var actualAge: Int = 0

    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 18) 18
            else if (value in 18..30) value
            else value - 3
        }
}