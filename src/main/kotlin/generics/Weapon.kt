package main.kotlin.generics

open class Weapon
open class Riffle : Weapon()
class SniperRiffle : Riffle()

/* testing the out(producer of T) type
* Case class with modifier T produces T and it's subtypes
*  */
class Case<out T> {
    private val contents = mutableListOf<T>()
    fun produce(): T = contents.last()    // Producer OK
}

fun useProducer(case: Case<Riffle>) {
    val riffle = case.produce()
}

class Case1<in T> {
    private val contents = mutableListOf<T>()
    fun consume(item: T) = contents.add(item)
}

fun useConsumer(case1: Case1<Riffle>) {
    case1.consume(SniperRiffle())
}