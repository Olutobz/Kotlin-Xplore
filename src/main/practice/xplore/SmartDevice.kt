package main.practice.xplore

/**
 * Created by Damola Olutoba Onikoyi
 * DATE: 05, August 2025
 * EMAIL: damexxey94@gmail.com
 */


open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun turnOn() {
        deviceStatus = "online"
    }

    open fun turnOff() {
        deviceStatus = "offline"
    }

}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    var speakerVolume = 4
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 19
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    var deviceTurnOnCount = 0
        private set

    fun increaseVolume() {
        speakerVolume++;
        println("Speaker volume increased to $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++;
        println("Change number increased to $channelNumber")
    }

    override fun turnOn() {
        super.turnOn()
        deviceTurnOnCount++
        println("$name is turned on.")
    }

    override fun turnOff() {
        super.turnOff()
        deviceTurnOnCount--
        println("$name is turned off.")
    }

}

class SmartHome(val smartTvDevice: SmartTvDevice) {

    fun increaseTvVolume() {
        smartTvDevice.increaseVolume()
    }
}