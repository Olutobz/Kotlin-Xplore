package main.practice.xplore

class Car(val color: String) {
    private val car1 = Car("Black")
    private val car2 = Car("Black")
    private val car3 = car1

    fun main() {
        print(car1 == car2) // false ( the equals() method not invoked as it's not a data class)
        print(car1 == car3) // true
        print(car1 === car2) // true
        println(car1 === car3) // true (reference equality)
    }
}
