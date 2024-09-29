package main.practice.xplore

data class User(var firstName: String?, var lastName: String?)

data class Developer(var name: String, var age: Int)

data class Fish(var name: String)

data class Decoration(val rocks: String)

data class DecorationX(val rocks: String, val wood: String, val diver: String)

data class Book(val title: String, val author: String)

data class Customer(val food: String, val price: Int)

data class Student(val id: Int, val firstName: String, val lastName: String) {
    var fullname = "$firstName -> $lastName"
}

val User.userFormattedName: String
    get() {
        return if (lastName != null) {
            if (firstName != null) {
                "$firstName -> $lastName"
            } else {
                lastName ?: "Unknown"
            }
        } else {
            firstName ?: "Unknown"
        }
    }

fun User.getFormattedName(): String {
    return if (lastName != null) {
        if (firstName != null) {
            "$firstName $lastName"
        } else {
            lastName ?: "Unknown"
        }
    } else {
        firstName ?: "unknown"
    }
}

fun getDeveloper(): Developer {
    return Developer(name = "toba", age = 12).apply {
        name = "Olutoba"
        age = 27
    }
}

fun createBook(): Book {
    return Book("CS101", "Damola Olutoba")
}
