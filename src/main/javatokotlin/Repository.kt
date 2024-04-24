package main.javatokotlin


fun main() {
    val user = User(null, lastName = "Onikoyi")
    println("Function: ${user.getFormattedName()}")

    val formattedName = user.userFormattedName
    println("Property: $formattedName")

    println(Repository.formattedUserNames)
    println(Repository.users)
}

object Repository {
    private val _users =
        mutableListOf(User("San Francisco", "California"))

    val users: List<User>
        get() = _users

    val formattedUserNames: List<String?>
        get() = _users.map { user -> user.userFormattedName }

    init {
        val user1 = User("Android", "Kotlin")
        val user2 = User("Manhattan", "New York")
        _users.apply {
            add(user1)
            add(user2)
        }
    }
}