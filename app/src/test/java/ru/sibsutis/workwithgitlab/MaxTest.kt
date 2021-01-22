package ru.sibsutis.workwithgitlab

import org.junit.Test

import org.junit.Assert.*

class MaxTest {

    @Test
    fun maxTest1() {
        val m: Functions = Functions()
        assertEquals(m.myMax(3, 5), 5)
    }

    @Test
    fun maxTest2() {
        val m: Functions = Functions()
        assertEquals(m.myMax(-17, 60), 60)
    }

    @Test
    fun maxTest3() {
        val m: Functions = Functions()
        assertEquals(m.myMax(3, 7), 7)
    }

    @Test
    fun maxTest4() {
        val m: Functions = Functions()
        assertEquals(m.myMax(5, 10), 10)
    }

    @Test
    fun maxTest5() {
        val m: Functions = Functions()
        assertEquals(m.myMax(5, 5), 5)
    }
}