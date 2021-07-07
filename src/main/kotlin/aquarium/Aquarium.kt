package main.kotlin.aquarium

import java.lang.Math.PI

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {

    init {
        println("aquarium initialising...")
    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = ((tank / (length * width)).toInt())
    }

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "Rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println(
            "Width: ${width}cm " +
                    "Length: ${length}cm " +
                    "Height: ${height}cm "
        )
        println("Volume: $volume l water: $water l (${water / volume * 100.0}% full)")
    }
}

class TowerTank(override var height: Int, var diameter: Int) :
    Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"

}

sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        // type checks
        is SeaLion -> "sea lion"
        is Walrus -> "walrus"
    }
}