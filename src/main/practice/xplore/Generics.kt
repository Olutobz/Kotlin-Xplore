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

class Quiz : ProgressPrintable {
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

    override val progressText: String
        get() = "$answered out of $total answered."

    override fun printProgressBar() {
        repeat(answered) { print("▓") }
        repeat(times = total - answered) { print("▒") }
        println()
        println(progressText)
    }

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 4
    }

    fun printQuizQuestions() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
}

fun main() {
    Quiz().apply {
        printProgressBar()
        println("Progress: ${Quiz.answered * 100 / Quiz.total}%")
        println("--------------------------------------------")
        printQuizQuestions()
    }
}