package main.practice.xplore

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
