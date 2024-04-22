package main.practice.tutorials

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 March 2024
 * EMAIL: damexxey94@gmail.com
 */

class Sample {
    var actualAge: Int = 0

    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 18) 18
            else if (value in 18..30) value
            else value - 3
        }

    companion object {
        fun getMax(vararg numbers: Int): Int {
            var max = numbers[0]
            for (number in numbers) {
                if (number > max) max = number
            }
            return max
        }

        fun searchFor(searchWord: String, searchEngine: String = "Google") {
            println("Searching for $searchWord on $searchEngine")
        }
    }

}