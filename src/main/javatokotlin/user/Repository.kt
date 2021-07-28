package main.javatokotlin.user

object Repository {

    private val _users =
        mutableListOf(User("Chinedu", "Ihedioha"), User("Uche", ""), User("Olutoba", null))

    val users: List<User>
        get() = _users

    val formattedUserNames: List<String?>
        get() = _users.map { user -> user.userFormattedName }
}

//    init {
//        val user1 = User("Chinedu", "Ihedioha")
//        val user2 = User("Uche", "")
//        val user3 = User("Olutoba", null)
//
//        _users.apply {
//            add(user1)
//            add(user2)
//            add(user3)
//        }
//    }

// extension function
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

// extension property
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

val user = User("Olutoba ", "Onikoyi")
val name = user.getFormattedName()
val formattedName = user.userFormattedName