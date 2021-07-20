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
            val userNames = ArrayList<String>(users.size)
            for ((firstName, lastName) in users) {
                val name = if (lastName != null) {
                    if (firstName != null) {
                        "$firstName $lastName"
                    } else {
                        lastName
                    }
                } else {
                    firstName ?: "Unknown"
                }
                userNames.add(name)
            }
            return userNames
        }
}