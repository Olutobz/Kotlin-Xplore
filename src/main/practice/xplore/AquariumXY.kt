package main.practice.xplore

open class AquariumXY(
    open var length: Int = 100,
    open var width: Int = 20,
    open var height: Int = 40
) {
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

    open val water: Double
        get() = volume * 0.9

    fun printSize() {
        println("$shape\nWidth: ${width}cm\nLength: ${length}cm\nHeight: ${height}cm")
        println("Volume: $volume l water: $water l (${water / volume * 100.0}% full)")
    }
}