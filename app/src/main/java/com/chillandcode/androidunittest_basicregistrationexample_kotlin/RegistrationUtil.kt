package com.chillandcode.androidunittest_basicregistrationexample_kotlin
// we are using test implementation - in this basic example to get you understand how it works
// it runs without emulator
//

object RegistrationUtils {
    fun validateRegistrationInput(username: String): Boolean {
        if (username.isEmpty()) return false
        if (username.length < 6) return false
        return true
    }
}