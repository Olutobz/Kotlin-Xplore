package main.kotlin

import main.kotlin.aquarium.Aquarium
import java.util.*

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun main() {
    feedTheFish()
    eagerExample()
    printLists()
    maps()
    printPairs()
    giveMeATool()
    destructing()
    extensionExample()
    testLambdas()
}

fun randomDay(): String {
    val week = arrayOf(
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    )
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redWorms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    // apply filter lazily
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList())

    // apply map lazily
    val lazyMap = decorations.asSequence().map { print("map: $it") }
    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")

}

fun printLists() {
    val list = listOf(1, 5, 3, 4)
    println(list)
    println("sum is: ${list.sum()}")

    val list2 = listOf("a", "bbb", "cc")
    println(list2)
    println("Sum of chars: ${list2.sumOf { it.length }}")

    for (i in list2.listIterator()) {
        println("$i ")
    }
}

fun maps() {
    val names = mapOf("Olutoba" to "Damilola Boyfriend", "Android" to "Android Developers")
    println(names["olutoba"])


    val cures = hashMapOf("white spots" to "Itch", "red sores" to "hole disease")
    println(cures["white spots"])
    println(cures["red sores"])
    println(cures.getOrDefault("mami", "Olutoba's babe"))
    println(cures.getOrElse("bloating") { "No cure for this" })

    val inventory = mutableMapOf("fish nets" to 1)
    inventory["tank scrubber"] = 3
    println(inventory.toString())
    inventory.remove("fish nets")
    println(inventory.toString())

}

fun printPairs() {
    val equipment = "fishnet" to "catching fish"
    val equip = ("fishnet" to "catching fish") to ("of big size" to "and strong")
    val fishnet = "fishnet" to "catching fish"
    val (tool, use) = fishnet
    println("the $tool is a tool for $use")
    println(fishnet.toString())
    println(fishnet.toList())
    println(equipment.first)
    println(equip.first)
    println(equip.second)

    val plant: Aquarium? = null
    plant.pull()

}

fun giveMeATool(): Pair<String, String> {
    return ("fishnet" to "catching fish")
}

fun destructing() {
    val (tool, use) = giveMeATool()
    println("Destructing $tool and $use")
    println("Testing extension function".hasSpaces())

}

fun String.hasSpaces() = find { it == ' ' } != null

fun extensionExample() {
    "Android development in kotlin".hasSpaces()
}

fun Aquarium?.pull() {
    this?.apply {
        println("Removing $this")
    }
}

// Testing lambdas
fun testLambdas() {
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter)
    println(waterFilter(30))
}

fun intro(name: String) {
    print(name)

}