package main.practice.callbacks

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 March 2024
 * EMAIL: damexxey94@gmail.com
 */

fun main() {
    println("Your data is loading ...")
    loadDataFromServer {
        println("Loaded data: $it")
    }
}

fun loadDataFromServer(callback: (List<String>) -> Unit) {
    Thread.sleep(5000)
    val data = listOf("Olutoba", "Damola", "Bode", "Damilola", "Israel")
    callback(data)
}
