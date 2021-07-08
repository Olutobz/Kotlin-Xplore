package main.kotlin.generics

class Aquarium<T : WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) {
            "Water supply needs processing first"
        }

        println("Adding water from $waterSupply")
    }
}

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println("Water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("Water needs processing: ${aquarium.waterSupply.needsProcessing}")

    val lakeAquarium = Aquarium(LakeWater())
    lakeAquarium.waterSupply.filter()
    lakeAquarium.addWater()

    val fishAquarium = Aquarium(FishStoreWater())
    fishAquarium.addWater()
}


fun main() {
    genericsExample()
}