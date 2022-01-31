package com.example.leetdroid.utils

import android.content.Context
import android.content.SharedPreferences
import java.text.SimpleDateFormat
import java.util.*


class Preferences(context: Context) {

    private val preferences: SharedPreferences =
        context.getSharedPreferences("data", Context.MODE_PRIVATE)

    var questionsFetched: Boolean
        get() = preferences.getBoolean("questionsFetched", false)
        set(value) = preferences.edit().putBoolean("questionsFetched", value).apply()

    var contestsInserted: Boolean
        get() = preferences.getBoolean("contestsInserted", false)
        set(value) = preferences.edit().putBoolean("contestsInserted", value).apply()

    var timerEnded: Boolean
        get() = preferences.getBoolean("timerEnded", false)
        set(value) = preferences.edit().putBoolean("timerEnded", value).apply()

    var userDataLoaded: Boolean
        get() = preferences.getBoolean("userDataLoaded", false)
        set(value) = preferences.edit().putBoolean("userDataLoaded", value).apply()

    var userAdded: Boolean
        get() = preferences.getBoolean("userAdded", false)
        set(value) = preferences.edit().putBoolean("userAdded", value).apply()

    var dailyQuestionLoaded: Boolean
        get() = preferences.getBoolean("dailyQuestionLoaded", false)
        set(value) = preferences.edit().putBoolean("dailyQuestionLoaded", value).apply()

    var dailyQuestionAdded: Boolean
        get() = preferences.getBoolean("dailyQuestionAdded", false)
        set(value) = preferences.edit().putBoolean("dailyQuestionAdded", value).apply()
}