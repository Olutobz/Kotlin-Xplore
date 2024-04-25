package main.practice.xplore

class Utils private constructor() {
    companion object {
        fun getScore(value: Int): Int {
            return 2 * value
        }
    }
}

object Util {
    fun getScore(value: Int): Int {
        return 2 * value
    }
}