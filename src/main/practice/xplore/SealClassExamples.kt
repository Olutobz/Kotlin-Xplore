package main.practice.xplore

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 09, July 2024
 * EMAIL: damexxey94@gmail.com
 */

sealed class Example {
    data class ExampleWithName(val name: String) : Example()
    data class ExampleWithNumber(val number: Int) : Example()
    data object EmptyExample : Example()
}

sealed class ApiResponse<out T> {
    data class Success<out T>(val data: T) : ApiResponse<T>()
    data class Error(val exception: Throwable) : ApiResponse<Nothing>()
}

sealed class Seal {
    data object SeaLion : Seal()
    data object Walrus : Seal()
}

sealed class CustomException(override val message: String?) : Exception() {
    class DivisionByZeroException : CustomException(DIVISION_BY_ZERO_EXCEPTION_MSG)
    class NegativeRadiusException : CustomException(RADIUS_ERROR_MSG)

    private companion object {
        const val DIVISION_BY_ZERO_EXCEPTION_MSG = "You cannot divide by zero, Please choose a different number"
        const val RADIUS_ERROR_MSG = "The radius cannot be negative"
    }
}

sealed class AcceptedCurrency {
    abstract val valueInDollars: Float
    private var amount: Float = 0.0f

    fun totaAmount() = amount * valueInDollars

    class Dollar : AcceptedCurrency() {
        override val valueInDollars: Float = 1.0f
    }

    class Euro : AcceptedCurrency() {
        override val valueInDollars: Float = 1.25f
    }

    class Crypto : AcceptedCurrency() {
        override val valueInDollars: Float = 234.92f
    }
}

fun printExample(example: Example) {
    when (example) {
        is Example.EmptyExample -> println("Empty Example")
        is Example.ExampleWithName -> println("Example with name: ${example.name}")
        is Example.ExampleWithNumber -> println("Example with number: ${example.number}")
    }
}

fun <T> handleResponse(response: ApiResponse<T>) {
    when (response) {
        is ApiResponse.Success<T> -> println("Successfully Connected: ${response.data}")
        is ApiResponse.Error -> println("Error due to connection, please try again!")
    }
}

fun matchSeal(seal: Seal) {
    return when (seal) {
        is Seal.SeaLion -> println("sea lion")
        is Seal.Walrus -> println("walrus")
    }
}

fun main() {
    val exampleWithName = Example.ExampleWithName("Olutoba")
    val exampleWithNumber = Example.ExampleWithNumber(27)
    val emptyExample = Example.EmptyExample

    printExample(example = exampleWithName)
    printExample(example = exampleWithNumber)
    printExample(example = emptyExample)

    val dataOk: ApiResponse<Int> = ApiResponse.Success(data = 2)
    val dataFailed: ApiResponse<Nothing> = ApiResponse.Error(exception = Throwable())
    handleResponse(response = dataOk)
    handleResponse(response = dataFailed)

    val seals = listOf(Seal.Walrus, Seal.SeaLion)
    for (item in seals) {
        matchSeal(item)
    }
}
