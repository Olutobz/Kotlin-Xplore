package main.javatokotlin.user

object Repository {

    private val _users = mutableListOf<User>()

    val users: List<User>
        get() = _users

    val formattedUserNames: List<String?>
        get() {
            return _users.map { it ->
                if (it.lastName != null) {
                    if (it.firstName != null) {
                        "${it.firstName} ${it.lastName}"
                    } else {
                        it.lastName ?: "unknown"
                    }
                } else {
                    it.firstName ?: "Unknown"
                }
            }
        }

    init {
        val user1 = User("Chinedu", "Ihedioha")
        val user2 = User("Uche", "")
        val user3 = User("Olutoba", null)

        _users.add(user1)
        _users.add(user2)
        _users.add(user3)
    }
}

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