package main.practice.xplore

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 24 April 2024
 * EMAIL: damexxey94@gmail.com
 */


interface SomeInterface<T> {
    fun doSomething(data: T)
}

interface SomeInterfaceTwo<T : Collection<*>> {
    fun doSomething(data: T)
}

interface Cleaner<in T : WaterSupply> {
    fun clean(waterSupply: T)
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

interface InExample<in T> {
    fun acceptValue(value: T)
}

interface OutExample<out T> {
    fun returnValue(): T
}

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}
