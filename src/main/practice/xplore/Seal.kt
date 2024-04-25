package main.practice.xplore

sealed class Seal
object SeaLion : Seal()
object Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        // type checks
        is SeaLion -> "sea lion"
        is Walrus -> "walrus"
    }
}