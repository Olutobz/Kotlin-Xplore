package main.practice.test

import main.practice.tutorials.*

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 14 April 2024
 * EMAIL: damexxey94@gmail.com
 */

fun main() {

    val name = "Olutoba is an Android Engineer"
    println(name.addExclamation())

    var list = (1..20).toList()
    println("Initial list: $list")
    list = list.filter { it > 8 }
    println("Updated list: $list")

    val circle1 = Circle(2.3)
    val rectangle1 = Rectangle(16.3, 34.2)
    val triangle1 = Triangle(13.8, 6.5, 3.5)

    var shapes = listOf(circle1, rectangle1, triangle1)
    shapes = shapes.customFilter { it.area() > 20.0 }
    for (shape in shapes) {
        println("${shape.name}: Area : ${shape.area()}")
    }

    val intList = (1..10).toList()
    println(intList)
    val sum = intList.customSum { it % 2 == 1 }
    println("The sum is: $sum")

    val pair = Pair(27, "Olutoba")
    println("Pair: $pair")

    val triple = Triple(1.0, "Hello generics", true)
    println("Triple: $triple")

    val customTriple = CustomTriple(2.0, "Hello Kotlin", false)
    customTriple.show()

    val listInt = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("The product of $listInt is ${listInt.products()}")

    println("Your data is loading ...")
    loadDataFromServer { println("Loaded data: $it") }

    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    nums.forEach {
        print("$it ")
    }
    println()
    nums.filter { it > 3 }.forEach {
        print("$it ")
    }

    val (even, odd) = nums.partition { it % 2 == 0 }
    println("\nEven: ${even}\nOdd:${odd}")

    val (first, second) = "param=car".split("=")
    println("$first $second")

    println(getDeveloper())

    val user = User(null, lastName = "Onikoyi")
    println("Function: ${user.getFormattedName()}")

    val formattedName = user.userFormattedName
    println("Property: $formattedName")

    println(Repository.formattedUserNames)
    println(Repository.users)

}

private fun <T> List<T>.customFilter(predicate: (T) -> Boolean): List<T> {
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (predicate(item)) {
            resultList.add(item)
        }
    }
    return resultList
}

private fun List<Int>.customSum(predicate: (Int) -> Boolean): Int {
    var sum = 0
    for (item in this) {
        if (predicate(item)) {
            sum += item
        }
    }
    return sum
}

private fun List<Int>.products(): Int {
    var result = 1
    for (value in this) {
        result *= value
    }
    return result
}

private fun loadDataFromServer(callback: (List<String>) -> Unit) {
    Thread.sleep(5000)
    val data = listOf("Olutoba", "New York", "Android Engineer", "California", "Software Engineer")
    callback(data)
}

internal fun String.addExclamation(): String {
    return "$this!"
}
