package main.practice.xplore

import main.practice.test.exclamation

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 10 May 2024
 * EMAIL: damexxey94@gmail.com
 */

private typealias StudentAge = Int
private typealias StudentName = String
private typealias StudentCGPA = Double

fun main() {

}

fun testTypeAlias(id: StudentAge) {
    if (id > 18) {
        println("You are old enough to vote".exclamation())
    } else {
        println("You are too young to vote".exclamation())
    }
}

fun testTypeAlias(name: StudentName) {
    if (name == "Olutoba") println("You can login to your device".exclamation())
    else println("You do not have access to this device".exclamation())
}

fun testTypeAlias(cgpa: StudentCGPA) {
    when (cgpa) {
        4.5 -> println("You have graduated with a first class".exclamation())
        3.5 -> println("You have graduated with a second class upper".exclamation())
        2.5 -> println("You have graduated with a second class lower".exclamation())
        1.5 -> println("You have graduated with a third class upper".exclamation())
        else -> println("You did not pass".exclamation())
    }
}