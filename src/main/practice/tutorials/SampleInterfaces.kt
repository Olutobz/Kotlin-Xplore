package main.practice.tutorials

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