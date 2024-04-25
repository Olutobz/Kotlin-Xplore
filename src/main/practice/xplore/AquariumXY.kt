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

internal fun buildAquarium() {
    val myAquariumXY1 = AquariumXY()
    myAquariumXY1.printSize()

    // default height and length
    val myAquariumXY2 = AquariumXY(width = 25)
    myAquariumXY2.printSize()

    // default width
    val myAquariumXY3 = AquariumXY(length = 110, height = 35)
    myAquariumXY3.printSize()

    // everything custom
    val myAquariumXY4 = AquariumXY(width = 25, length = 110, height = 35)
    myAquariumXY4.printSize()

    val myAquariumXY5 = AquariumXY(numberOfFish = 29)
    myAquariumXY5.printSize()
    myAquariumXY5.volume = 70
    myAquariumXY5.printSize()

    val myAquariumXY6 = AquariumXY(length = 25, width = 25, height = 40)
    myAquariumXY6.printSize()

    val myTowerTank = TowerTank(diameter = 25, height = 40)
    myTowerTank.printSize()
}