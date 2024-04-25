package main.practice.xplore

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 25 April 2024
 * EMAIL: damexxey94@gmail.com
 */

object GoldColor : FishColor {
    override val color = "gold"
}

object RedColor : FishColor {
    override val color = "red"
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction by PrintingFishAction("a lot of algae"),
    FishColor by fishColor

// Singleton class


class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

fun delegate() {
    val pleco = Plecostomus(RedColor)
    println("Fish has color ${pleco.color}")
    pleco.eat()
}