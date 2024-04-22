package main.practice.tutorials

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 12 April 2024
 * EMAIL: damexxey94@gmail.com
 */


sealed class CustomException(override val message: String?) : Exception() {
    class DivisionByZeroException : CustomException("You cannot divide by zero, Please choose a different number")

    class NegativeRadiusException : CustomException("The radius cannot be negative")
}