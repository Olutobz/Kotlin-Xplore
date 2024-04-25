package main.kotlindocs.generics

import main.practice.xplore.Riffle
import main.practice.xplore.SniperRiffle
import main.practice.xplore.Weapon


fun main() {
    useProducer(Case<SniperRiffle>())
    useProducer(Case())
    useConsumer(Case1<Weapon>())
    useProducerConsumer(Case2())
}

/* testing the out(producer of T) type, It's a covariant
* Case class with modifier out produces T and it's subtypes
* (i.e. preserves subtyping)
*  */

class Case<out T> {
    private val contents = mutableListOf<T>()
    fun produce(): T = contents.last()    // Producer OK
}

fun useProducer(case: Case<Riffle>) {
    val riffle = case.produce()
}

/* testing the in (consumer of T) type, It's called a contravariant
case class1 with modifier in, the subtyping is reversed
* */
class Case1<in T> {
    private val contents = mutableListOf<T>()
    fun consume(item: T) = contents.add(item)
}

fun useConsumer(case1: Case1<Riffle>) {
    case1.consume(SniperRiffle())
}

/* Generic type without any variant (invariant)
* A producer as well as a consumer of T, disallows subtyping */
class Case2<T> {
    private val contents = mutableListOf<T>()
    fun produce(): T = contents.last() // producer OK
    fun consume(item: T) = contents.add(item) // Consumer OK
}

fun useProducerConsumer(case: Case2<Riffle>) {
    case.produce()
    case.consume(SniperRiffle())
}