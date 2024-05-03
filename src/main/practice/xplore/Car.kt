package main.practice.xplore

class Car(val color: String) {
    class Engine(private val engineSerialNumber: Int) {
        override fun toString(): String {
            return "Engine($engineSerialNumber)"
        }
    }

    inner class Gear(private val noOfGears: Int) {
        override fun toString(): String {
            return "Gear($noOfGears) -> color:$color"
        }
    }
}
