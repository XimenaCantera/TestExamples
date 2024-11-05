package com.itesm.test_sample_live

import org.junit.Assert.*
import org.junit.Test

class UserTest {

    @Test
    fun testIsAdult() {
        val user = User("John", 20)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsNotAdult() {
        val user = User("Jane", 15)
        assertFalse(user.isAdult())
    }

    @Test
    fun testGetName() {
        val user = User("Alice", 25)
        assertEquals("Alice", user.name)
    }

    @Test
    fun testGetAge() {
        val user = User("Bob", 30)
        assertEquals(30, user.getAge())
    }
}
