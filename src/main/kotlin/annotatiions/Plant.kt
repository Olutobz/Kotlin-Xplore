package main.kotlin.annotatiions

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
    val isGrowing : Boolean = true

    @set:OnSet
    var needFood : Boolean = false
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

fun main() {
    testAnnotations()
}