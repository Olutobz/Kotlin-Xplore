package main.practice.xplore

/**
 * Created by Damola Olutoba Onikoyi
 * DATE: 29, September 2024
 * EMAIL: damexxey94@gmail.com
 */

fun main() {
    val numbers = listOf(1, 2, 3, 4)
    val numbers2 = listOf(1, -2, 3)

    // prints each element
    numbers.forEach { value ->
        print("$value ")
    }
    println()

    // perform an action on each element and its index
    numbers.forEachIndexed { index, value ->
        println("Index $index : $value")
    }

    // check if all elements are positives
    val allPositiveNums = numbers.all { it > 0 }
    println("All numbers are positive? $allPositiveNums")

    // checks if any number is negative
    val anyNegativeNums = numbers2.any { it < 0 }
    println("Is any number negative? $anyNegativeNums")

    // checks if no elements are negative
    val noneNegative = numbers.none { it < 0 }
    println("There is no negative number? $noneNegative")

    // matches given predicate (first even number), otherwise null
    val firstEvenNums = numbers.firstOrNull { it % 2 == 0 }
    println("First even number: $firstEvenNums")

    // doubles each number in an old list
    val doubledList = numbers.map { it * 2 }
    println("Transformed new list: $doubledList")

    // transform/flatten each elem in a collection to a single list
    val flatList = listOf(numbers, numbers2).flatten()
    println("FlatList transformed new list: $flatList")

    // group elems of a collection based on a key
    val groupByModTwo = numbers.groupBy { it % 2 }
    println("Group by modTwo transformed new list: $groupByModTwo")

    // split into a +ve and -ve list
    val (positiveNums, negativeNums) = numbers2.partition { it > 0 }
    println("Positive nums: $positiveNums\nNegative nums: $negativeNums")

    // combine two collections into a single collection pair
    val names = listOf("Toba", "Damola", "Olutoba")
    val score = listOf(27, 18, 24)
    val result = names.zip(score) { name, value -> "$name scored $value" }
    println(result)

    // filter to include only even numbers
    val evenNums = numbers.filter { it % 2 == 0 }
    println("Even numbers are: $evenNums")

    // filter to include only non-null numbers
    val nonNullList = listOfNotNull(1, null, 2, null, 3)
    println("Non-null numbers are: $nonNullList")

    // return first even number found
    val firstEvenNum = numbers.find { it % 2 == 0 }
    println("First even number is: $firstEvenNum")

    // return a specified number of elements from the beginning of a collection.
    val firstFive = listOf(3, 2, 7, 4, 5, 6, 0).take(5)
    println("First five elements in the list are: $firstFive")

    // return elements from the beginning of a collection while a condition is true.
    val lessThanFive = listOf(1, 2, 3, 6, 4, 8).takeWhile { it < 5 }
    println("First Elements in the list lower than 5: $lessThanFive")

    // drop elements from the beginning of a collection
    val withoutFirstThree = listOf(1, 2, 3, 4, 5, 6).drop(3)
    println("Elems without first three: $withoutFirstThree")

    // drop elements from the beginning of a collection while a condition is true.
    val afterFive = listOf(1, 2, 3, 4, 11, 5, 6, 9).dropWhile { it < 5 }
    println("After elements in the list are: $afterFive")

    // returns unique elements in the list
    val distinctList = listOf(1, 2, 3, 3, 4, 1, 5, 7, 5).distinct()
    println("Distinct elements in the list are: $distinctList")

    val customer = listOf(
        Customer(food = "Pizza", price = 25),
        Customer(food = "Rice", price = 30),
        Customer(food = "donuts", price = 15)
    )

    // returns a list of elements with distinct keys produced by the selector function.
    val personsDistinctByName = customer.distinctBy { it.food }
    println(personsDistinctByName)

}
