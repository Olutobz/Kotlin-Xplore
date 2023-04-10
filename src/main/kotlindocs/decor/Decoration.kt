package main.kotlin.decor

data class Decoration(val rocks: String)

data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun main() {
    makeDecorations()
    println()

    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("Slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    val decoration4 = decoration3.copy()
    println(decoration3)
    println(decoration4)

    val decoration5 = Decoration2("crystal", "wood", "diver")
    println(decoration5)

    println(decoration1 == decoration2)
    println(decoration3 == decoration2)

}