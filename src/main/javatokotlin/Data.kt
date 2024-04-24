package main.javatokotlin

data class User(var firstName: String?, var lastName: String?)

data class Developer(var name: String, var age: Int)

val User.userFormattedName: String
    get() {
        return if (lastName != null) {
            if (firstName != null) {
                "$firstName $lastName"
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
