package main.javatokotlin


fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    nums.forEach {
        print("$it ")
    }
    println()
    nums.filter { it > 3 }.forEach {
        print("$it ")
    }

    val (even, odd) = nums.partition { it % 2 == 0 }
    println("\nEven: ${even}\nOdd:${odd}")

    val (first, second) = "param=car".split("=")
    println("$first $second")

    println(getDeveloper())
}

class SomeClass : SomeInterface<String> {
    override fun doSomething(data: String) {
        println(data)
    }
}

class SomeClassTwo : SomeInterfaceTwo<List<String>> {
    override fun doSomething(data: List<String>) {
        for (item in data) {
            println(item)
        }
    }
}

enum class Direction(val direction: Int) {
    NORTH(1),
    EAST(2),
    SOUTH(3),
    WEST(4)
}
