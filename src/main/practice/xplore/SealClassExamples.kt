package main.practice.xplore

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 09, July 2024
 * EMAIL: damexxey94@gmail.com
 */

fun main() {
    val exampleWithName = Example.ExampleWithName("Olutoba")
    val exampleWithNumber = Example.ExampleWithNumber(27)
    val emptyExample = Example.EmptyExample

    printExample(exampleWithName)
    printExample(exampleWithNumber)
    printExample(emptyExample)

    val dataOk: ApiResponse<Int> = ApiResponse.Success(2)
    val dataFailed: ApiResponse<Nothing> = ApiResponse.Error(Throwable())
    handleResponse(dataOk)
    handleResponse(dataFailed)

    val seals = listOf(Seal.Walrus, Seal.SeaLion)
    for (item in seals) {
        matchSeal(item)
    }
}

sealed class Example {
    data class ExampleWithName(val name: String) : Example()
    data class ExampleWithNumber(val number: Int) : Example()
    data object EmptyExample : Example()
}

fun printExample(example: Example) {
    when (example) {
        Example.EmptyExample -> println("Empty Example")
        is Example.ExampleWithName -> println("Example with name: ${example.name}")
        is Example.ExampleWithNumber -> println("Example with number: ${example.number}")
    }
}

sealed class ApiResponse<out T> {
    data class Success<out T>(val data: T) : ApiResponse<T>()
    data class Error(val exception: Throwable) : ApiResponse<Nothing>()
}

fun <T> handleResponse(response: ApiResponse<T>) {
    when (response) {
        is ApiResponse.Success<T> -> println("Successfully Connected: ${response.data}")
        is ApiResponse.Error -> println("Error due to connection, please try again!")
    }
}

sealed class Seal {
    data object SeaLion : Seal()
    data object Walrus : Seal()
}

fun matchSeal(seal: Seal) {
    return when (seal) {
        is Seal.SeaLion -> println("sea lion")
        is Seal.Walrus -> println("walrus")
    }
}

sealed class CustomException(override val message: String?) : Exception() {
    class DivisionByZeroException : CustomException("You cannot divide by zero, Please choose a different number")

    class NegativeRadiusException : CustomException("The radius cannot be negative")
}
