package main.practice.xplore

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 11 April 2024
 * EMAIL: damexxey94@gmail.com
 */
class Database private constructor() {
    companion object {
        private var instance: Database? = null

        fun getInstance(): Database? {
            if (instance == null) {
                synchronized(Database::class.java) {
                    if (instance == null) {
                        instance = Database()
                    }
                }
            }
            return instance
        }
    }

}