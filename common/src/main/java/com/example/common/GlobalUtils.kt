package com.example.common

import android.util.Log

object GlobalUtils {
    const val testUtilsUrl = ""
}

fun logFunctions(msg: String) = Log.d("functions", msg)

fun logFunctionError(msg: String) = Log.e("log", msg)

