package main.kotlin

class DemoPractices {

    class Car(val color: String) {
        private val car1 = Car("Black")
        private val car2 = Car("Black")
        private val car3 = car1

        fun main() {
            print(car1 == car2) // false ( the equals() method not invoked as it's not a data class)
            print(car1 == car3) // true
            print(car1 === car2) // true
            println(car1 === car3) // true (reference equality)
        }
    }

    fun divideByThree(x: Int): Int {
        return x / 3
    }

    private inline fun repeat(times: Int, action: () -> Unit) {
        for (i in 0 until times) {
            action()
        }
    }

    private inline fun repeatII(times: Int, noinline action: () -> Unit) {
        for (i in 0 until times) {
            action()
        }
    }

    private inline fun doSomething(a: Int, b: Int, noinline operation: (Int, Int) -> Int) {
        val res = operation(a, b)
        println(res)

    }

    fun add(a: Int, b: Int): Int {
        // Some complex logic
        return a + b
    }

    fun main(args: Array<String>) {
        repeat(5) {
            println("Hello World!")
        }

        doSomething(2, 4) { a, b ->
            a + b
        }

        doSomething(3, 6, ::add)
    }


}