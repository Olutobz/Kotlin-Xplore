package main.practice.xplore

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 03 May 2024
 * EMAIL: damexxey94@gmail.com
 */
object StudentRegistry {
    private val allStudents = mutableListOf<Student>()

    fun addStudent(student: Student) {
        allStudents.add(student)
    }

    fun removeStudent(student: Student) {
        allStudents.remove(student)
    }

    fun listAllStudents() {
        allStudents.forEach { println(it.fullname) }
    }
}
