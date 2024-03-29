package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */

abstract class Shape(
    var shapeType: String
) {

    fun changeTypeName(newType: String) {
        shapeType = newType
    }

}