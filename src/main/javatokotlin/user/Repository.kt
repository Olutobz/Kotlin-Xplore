package main.javatokotlin.user

import java.util.ArrayList

object Repository {

    private val users = mutableListOf<User>()

    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Chinedu", "Ihedioha")
        val user2 = User("Uche", "")
        val user3 = User("Olutoba", null)

        users.add(user1)
        users.add(user2)
        users.add(user3)
    }

    fun getUsers(): List<User> {
        return users
    }

    val formattedUserNames: List<String?>
        get() {
            return users.map { user ->
                if (user.lastName != null) {
                    if (user.firstName != null) {
                        "${user.firstName} ${user.lastName}"
                    } else {
                        user.lastName ?: "unknown"
                    }
                } else {
                    user.firstName ?: "Unknown"
                }
            }
        }
}