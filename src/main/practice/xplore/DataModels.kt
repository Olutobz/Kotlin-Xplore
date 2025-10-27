package main.practice.xplore

data class User(var firstName: String?, var lastName: String?)

data class Developer(var name: String, var age: Int)

data class Fish(var name: String)

data class Decoration(val rocks: String)

data class DecorationX(
    val rocks: String,
    val wood: String, val
    diver: String
)

data class Book(val title: String, val author: String)

data class Customer(val food: String, val price: Int)

data class Student(
    val id: Int,
    val firstName: String,
    val lastName: String
) {
    var fullName = "Student's full name is: $firstName $lastName"
}

data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val duration: Int
)

val User.userFormattedName: String
    get() {
        return if (lastName != null) {
            if (firstName != null) {
                "$firstName $lastName"
            } else {
                lastName.orEmpty()
            }
        } else {
            firstName.orEmpty()
        }
    }

fun User.getFormattedName(): String {
    return if (lastName != null) {
        if (firstName != null) {
            "$firstName $lastName"
        } else {
            lastName.orEmpty()
        }
    } else {
        firstName.orEmpty()
    }
}

fun getDeveloper(): Developer {
    return Developer(name = "toba", age = 12).apply {
        name = "Olutoba"
        age = 27
    }
}

fun createBook() = Book(title = "CS101", author = "Damola Olutoba")

