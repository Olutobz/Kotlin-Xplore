package main.practice.xplore

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 05 May 2024
 * EMAIL: damexxey94@gmail.com
 */
sealed class AcceptedCurrency {
    abstract val valueInDollars: Float
    private var amount: Float = 0.0f

    fun totalValueInDollars(): Float {
        return amount * valueInDollars
    }

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