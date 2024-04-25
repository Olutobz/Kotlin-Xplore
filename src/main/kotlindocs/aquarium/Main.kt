package main.kotlin.aquarium

import main.practice.xplore.AquariumXY
import main.practice.xplore.TowerTank

fun main() {
    buildAquarium()
    println()
    delegate()
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

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

fun delegate() {
    val pleco = Plecostomus(RedColor)
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction by PrintingFishAction("a lot of algae"),
    FishColor by fishColor

// Singleton class
object GoldColor : FishColor {
    override val color = "gold"
}

object RedColor : FishColor {
    override val color = "red"
}

class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() {
        println(food)
    }

}