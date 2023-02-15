package main.kotlin

class InlineFuncDemo {

    fun guide() {
        println("Guide Start!")
        teach()
        println("Guide ended")
    }

    private inline fun teach() {
        print("Teach")
    }


}