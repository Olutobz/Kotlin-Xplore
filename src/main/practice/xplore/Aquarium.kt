package main.practice.xplore

class Aquarium<out T : WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        check(!waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("Water added")
    }

    inline fun <reified R : WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}

fun genericsExample() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    println(aquarium.hasWaterSupplyOfType<TapWater>()) // True
    println(aquarium.waterSupply.isOfType<TapWater>()) // True

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

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("$aquarium added")

inline fun <reified T : WaterSupply> WaterSupply.isOfType() = this is T
inline fun <reified R : WaterSupply> Aquarium<*>.hasWaterSupplyOfType2() = waterSupply is R