package main.practice.xplore

/**
 * Created by Damola Olutoba Onikoyi
 * DATE: 08, September 2025
 * EMAIL: damexxey94@gmail.com
 */

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class Quiz {
    val question1 = Question(
        questionText = "How many days are there between full moons?",
        answer = 28,
        difficulty = Difficulty.EASY
    )

    val question2 = Question(
        questionText = "Where is the Golden Gate Bridge located?",
        answer = "San Francisco",
        difficulty = Difficulty.MEDIUM
    )

    val question3 = Question(
        questionText = "How many states are in the United States of America?",
        answer = 50,
        difficulty = Difficulty.HARD
    )

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 4
    }
}

val Quiz.StudentProgress.progressText: String
    get() = "${Quiz.answered} out of ${Quiz.total} answered."

fun Quiz.StudentProgress.printProgressBar() {
    repeat(this.answered) {
        print("▓")
    }
    repeat(times = this.total) {
        print("▒")
    }
    println()
    println(Quiz.progressText)
}

fun main() {
    Quiz.printProgressBar()
    println("Progress: ${Quiz.answered * 100 / Quiz.total}%")
}