package main.practice.xplore

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */
enum class ShapeType {
    CIRCLE,
    TRIANGLE,
    RECTANGLE
}

enum class DaysOfTheWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum class Direction(val direction: Int) {
    NORTH(1),
    EAST(2),
    SOUTH(3),
    WEST(4)
}

enum class Temp(val degrees: Int) {
    HOT(95),
    WARM(32),
    COLD(16)
}