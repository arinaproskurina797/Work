package ru.sibsutis.workwithgitlab

import org.junit.Test

import org.junit.Assert.*

class MinTest {

    @Test
    fun minTest1() {
        val m: Functions = Functions()
        assertEquals(m.myMin(5, 10), 5)
    }

    @Test
    fun minTest2() {
        val m: Functions = Functions()
        assertEquals(m.myMin(3, -7), -7)
    }

    @Test
    fun minTest3() {
        val m: Functions = Functions()
        assertEquals(m.myMin(2, 9), 2)
    }

    @Test
    fun minTest4() {
        val m: Functions = Functions()
        assertEquals(m.myMin(100,  350), 100)
    }

    @Test
    fun minTest5() {
        val m: Functions = Functions()
        assertEquals(m.myMin(5, 5), 5)
    }
}