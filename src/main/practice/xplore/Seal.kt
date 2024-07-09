package main.practice.xplore

sealed class Seal {
    data object SeaLion : Seal()
    data object Walrus : Seal()
}

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Seal.SeaLion -> "sea lion"
        is Seal.Walrus -> "walrus"
    }
}