package main.kotlin.generics

class Aquarium<out T : WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        check(!waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("Water added")
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Item added")


fun genericsExample() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)
    addItemTo(aquarium)
    println("Water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("Water needs processing: ${aquarium.waterSupply.needsProcessing}")
    isWaterClean(aquarium)

    val lakeAquarium = Aquarium(LakeWater())
    lakeAquarium.waterSupply.filter()

    val fishAquarium = Aquarium(FishStoreWater())

}


fun main() {
    genericsExample()
}

interface Cleaner<in T : WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

fun <T : WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}