package com.itesm.test_sample_live

class User(val name: String, private val age: Int) {

    fun isAdult(): Boolean {
        return age >= 18
    }

    fun getAge(): Int {
        return age
    }
}
