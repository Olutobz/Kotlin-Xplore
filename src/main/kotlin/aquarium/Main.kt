package main.kotlin.aquarium

fun main() {
    buildAquarium()
    println()
    delegate()
}

internal fun buildAquarium() {
    val myAquarium1 = Aquarium()
    myAquarium1.printSize()

    // default height and length
    val myAquarium2 = Aquarium(width = 25)
    myAquarium2.printSize()

    // default width
    val myAquarium3 = Aquarium(length = 110, height = 35)
    myAquarium3.printSize()

    // everything custom
    val myAquarium4 = Aquarium(width = 25, length = 110, height = 35)
    myAquarium4.printSize()

    val myAquarium5 = Aquarium(numberOfFish = 29)
    myAquarium5.printSize()
    myAquarium5.volume = 70
    myAquarium5.printSize()

    val myAquarium6 = Aquarium(length = 25, width = 25, height = 40)
    myAquarium6.printSize()

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