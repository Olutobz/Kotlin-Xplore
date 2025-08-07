package main.practice.xplore

/**
 * Created by Damola Olutoba Onikoyi
 * DATE: 05, August 2025
 * EMAIL: damexxey94@gmail.com
 */


open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

    fun printDeviceInfo() {
        println("Device Name: $name, Category: $category, Type: $deviceType")
    }

}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulator(initialValue = 4, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 19, minValue = 0, maxValue = 200)

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseVolume() {
        speakerVolume++;
        println("Speaker volume increased to $speakerVolume")
    }

    fun increaseBrightness() {
        brightnessLevel++;
        println("Speaker brightness increased to $brightnessLevel")
    }

    fun nextChannel() {
        channelNumber++;
        println("Change number increased to $channelNumber")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }

}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        brightnessLevel++;
        println("Speaker brightness increased to $brightnessLevel")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }

}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set

    fun increaseTvVolume() {
        smartTvDevice.increaseVolume()
    }

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }
}