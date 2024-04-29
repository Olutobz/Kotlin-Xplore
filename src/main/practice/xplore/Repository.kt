package main.practice.xplore

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
        val user3 = User("Maine", "")
        _users.apply {
            add(user1)
            add(user2)
            add(user3)
        }
    }
}