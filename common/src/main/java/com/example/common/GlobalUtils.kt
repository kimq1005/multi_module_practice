package com.example.common

import android.util.Log

object GlobalUtils {
    val student = Student(
        name = "wow"
    )

    val Yeah = student.jump()
    const val testUtilsUrl = ""
}

fun logFunctions(msg: String) = Log.d("functions", msg)


class Student(private val name: String) {

    fun run() = println("$name 달립니다.")
    fun jump() = println("$name 점프합니다.")
    fun sing() = println("$name 노래합니다.")
    fun study() = println("$name 공부합니다.")

}

