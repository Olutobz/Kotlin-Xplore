package main.practice.xplore

import main.practice.test.capitalize
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

@ImAPlant
class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needFood: Boolean = false
}

fun testAnnotations() {
    // Get the class information at runtime
    val classObj = Plant::class
    for (i in classObj.declaredMemberFunctions) {
        println(i.name)
    }

    // Print all the annotation of a class
    val plantObject = Plant::class
    for (a in plantObject.annotations) {
        println(a.annotationClass.simpleName)
    }

    val plantObj = Plant::class
    val myAnnotationObject = plantObj.findAnnotation<ImAPlant>()
    println(myAnnotationObject)

}

fun labels() {
    outerLoop@ for (i in 1..100) {
        print("$i ")
        for (j in 1..100) {
            if (i > 10) break@outerLoop
        }
    }
    println()
}


fun fishClass() {
    val myFish = listOf(Fish("Flipper"), Fish("Moby dick"), Fish("Dory"))
    myFish.filter { it.name.contains("i") }.joinToString(", ") { it.name }
    println(myFish)

    val fish = Fish("splashy")
    with(fish.name) {
        println(capitalize())
    }

    val fish2 = Fish(name = "splashy").apply {
        name = "spurky"
    }
    println(fish2)

    println(
        fish.name.capitalize()
            .let { it + "fish" }.length
            .let { it + 31 }
    )
    println(fish)

}