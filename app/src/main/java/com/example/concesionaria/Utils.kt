package com.example.concesionaria

object Utils {
    fun checkNickName(nickName: String): Boolean {
        return nickName.length in 1..19 && nickName.all { it.isLetter() } && !nickName.contains(" ")
    }
}