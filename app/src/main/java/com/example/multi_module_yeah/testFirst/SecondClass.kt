package com.example.multi_module_yeah.testFirst

import android.util.Log

const val TAG = "로그"

val great: () -> Any = {
    Log.d(TAG, ":asdasd")
}

val great2 = Log.d(TAG, ":asdasd")
