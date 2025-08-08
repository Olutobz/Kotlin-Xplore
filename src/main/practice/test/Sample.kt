package main.practice.test

import main.practice.xplore.*
import java.util.*
import kotlin.concurrent.thread

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 14 April 2024
 * EMAIL: damexxey94@gmail.com
 */

fun main() {

    val name = "Olutoba is an Android Engineer"
    println(name.exclamation())

    var list = (1..20).toList()
    println("Initial list: $list")
    list = list.filter { it > 8 }
    println("Updated list: $list")

    val circle1 = Circle(2.3)
    val rectangle1 = Rectangle(16.3, 34.2)
    val triangle1 = Triangle(13.8, 6.5, 3.5)

    var shapes = listOf(circle1, rectangle1, triangle1)
    shapes = shapes.customFilter { it.area() > 20.0 }
    for (shape in shapes) {
        println("${shape.name}: Area : ${shape.area()}")
    }

    val intList = (1..10).toList()
    println(intList)
    val sum = intList.customSum { it % 2 == 1 }
    println("The sum is: $sum")

    val pair = Pair(27, "Olutoba")
    println("Pair: $pair")

    val triple = Triple(1.0, "Hello generics", true)
    println("Triple: $triple")

    val customTriple = CustomTriple(2.0, "Hello Kotlin", false)
    customTriple.show()

    val listInt = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("The product of $listInt is ${listInt.products()}")

    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    nums.forEach { print("$it ") }
    println()
    nums.filter { it > 3 }.forEach { print("$it ") }

    val (even, odd) = nums.partition { it % 2 == 0 }
    println("\nEven: ${even}\nOdd:${odd}")

    val (first, second) = "param=car".split("=")
    println("$first $second")

    println(getDeveloper())

    val user = User(null, lastName = "Onikoyi")
    println("Function: ${user.getFormattedName()}")

    val formattedName = user.userFormattedName
    println("Property: $formattedName")

    val (title, author) = createBook()
    println("$title -> $author")

    println(Repository.formattedUserNames)
    println(Repository.users)

    repeat(2) {
        println("Hello World!")
    }

    doSomething(2, 4) { a, b -> a + b }
    doSomething(3, 6, ::add)

    doTwice {
        println("Welcome To San Francisco!")
    }

    feedTheFish()
    eagerExample()
    showLists()
    maps()
    printPairs()
    giveMeATool()
    destructing()
    extensionExample()
    testLambdas()

    val toba = Student(1, "Damola", "Onikoyi")
    val android = Student(1, "Android", "Google")
    val kt = Student(1, "Kotlin", "Jetbrains")

    StudentRegistry.addStudent(toba)
    StudentRegistry.addStudent(android)
    StudentRegistry.addStudent(kt)
    StudentRegistry.removeStudent(android)
    StudentRegistry.listAllStudents()

    val car1 = Car("Black")
    val car2 = Car("Black")
    print(car1 == car2)
    print(car1 === car2)

    for (day in DayOfTheWeek.entries) {
        val currentDay = DayOfTheWeek.getCurrentDay(day.name)
        println("Day ${day.ordinal}: $currentDay")
    }

    useProducer(Case<SniperRiffle>())
    useProducer(Case())
    useConsumer(Case1<Weapon>())
    useProducerConsumer(Case2())

    guide()
    showMsgFromDiffThreads()
    println("Your data is loading ...")
    loadDataFromServer {
        println("Loaded data: $it")
    }
}

internal fun String.capitalize(): String {
    return this.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}

internal fun String.exclamation(): String {
    return "$this!"
}

private fun <T> List<T>.customFilter(predicate: (T) -> Boolean): List<T> {
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (predicate(item)) resultList.add(item)
    }
    return resultList
}

private fun List<Int>.customSum(predicate: (Int) -> Boolean): Int {
    var sum = 0
    for (item in this) {
        if (predicate(item)) sum += item
    }
    return sum
}

private fun List<Int>.products(): Int {
    var result = 1
    for (value in this) {
        result *= value
    }
    return result
}

private fun <T> List<T>.toBulletedList(): String {
    val separator = "\n -"
    return this.map { it }.joinToString(separator, prefix = separator, postfix = "\n")
}

private fun loadDataFromServer(callback: (List<String>) -> Unit) {
    Thread.sleep(5000)
    val data = listOf("Olutoba", "New York", "Android Engineer", "California", "Software Engineer")
    callback(data)
}

private fun showMsgFromDiffThreads() {
    thread(start = true, name = "Another thread") {
        (0..5).forEach {
            println("Message $it from the ${Thread.currentThread().name}")
        }
    }
    (0..10).forEach {
        println("Message $it from the ${Thread.currentThread().name}")
    }
}

fun guide() {
    println("Guide Start".exclamation())
    teach()
    println("Guide ended")
}

@Suppress("NOTHING_TO_INLINE")
private inline fun teach() = print("Teach")

fun divideByThree(x: Int) = x / 3

private inline fun repeat(times: Int, action: () -> Unit) {
    for (i in 0 until times) {
        action()
    }
}

@Suppress("NOTHING_TO_INLINE")
private inline fun repeatII(times: Int, noinline action: () -> Unit) {
    for (i in 0 until times) {
        action()
    }
}

@Suppress("NOTHING_TO_INLINE")
private inline fun doSomething(
    a: Int,
    b: Int,
    noinline operation: (Int, Int) -> Int
) = println(operation(a, b))

inline fun doTwice(action: () -> Unit) {
    action()
    action()
}

internal fun add(a: Int, b: Int) = a + b

private fun feedTheFish() {
    val food = fishFood(getRandomDay())
    println("On ${getRandomDay()} the fish eat $food")
}

private fun getRandomDay(): String {
    val week = arrayOf(
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    )
    return week[Random().nextInt(week.size)]
}

private fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redWorms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun testWhenCondition() {
    val x: Any = 4

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}

private fun giveMeATool(): Pair<String, String> {
    return ("fishnet" to "catching fish")
}

private fun destructing() {
    val (tool, use) = giveMeATool()
    println("Destructing $tool and $use")
    println("Testing extension function".hasSpaces())

}

fun String.hasSpaces() = find { it == ' ' } != null

fun extensionExample() = "Android development in kotlin".hasSpaces()

fun AquariumXY?.pull() {
    this?.apply {
        println("Removing $this")
    }
}

private fun testLambdas() {
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter)
    println(waterFilter(30))
}

private fun eagerExample() {
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

private fun showLists() {
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

private fun maps() {
    val names: Map<String, String> = mapOf("Olutoba" to "Damilola Boyfriend", "Android" to "Android Developers")
    println(names["olutoba"])

    val cures = hashMapOf("white spots" to "Itch", "red sores" to "hole disease")
    println(cures["white spots"])
    println(cures["red sores"])
    println(cures.getOrDefault("Damilola", "Olutoba\'s babe"))
    println(cures.getOrElse("bloating") { "No cure for this" })

    val inventory = mutableMapOf("fish nets" to 1)
    inventory["tank scrubber"] = 3
    println(inventory.toString())
    inventory.remove("fish nets")
    println(inventory.toString())

    val mapAny = mapOf(Pair("one", 1), Pair("two", 2), Pair("three", 3))
    val valuesForKeysWithE = mapAny.keys
        .filter { it.contains("e") }
        .map { "Value for $it: ${mapAny[it]}" }

    println("Value for key with E: $valuesForKeysWithE")

}

private fun printPairs() {
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

    val plant: AquariumXY? = null
    plant.pull()
}

private fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("Slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    val decoration4 = decoration3.copy()
    println(decoration3)
    println(decoration4)

    val decoration5 = DecorationX("crystal", "wood", "diver")
    println(decoration5)

    println(decoration1 == decoration2)
    println(decoration3 == decoration2)
}
