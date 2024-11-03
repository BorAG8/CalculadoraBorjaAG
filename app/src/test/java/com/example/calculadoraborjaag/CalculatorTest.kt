package com.example.calculadoraborjaag

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun testSuma() {
        assertEquals(5, calculator.calcular("2+3"))
        assertEquals(10, calculator.calcular("5+5"))
        assertEquals(0, calculator.calcular("2+2-4"))
    }

    @Test
    fun testResta() {
        assertEquals(1, calculator.calcular("3-2"))
        assertEquals(-1, calculator.calcular("3-4"))
    }

    @Test
    fun testMultiplicacion() {
        assertEquals(25, calculator.calcular("5*5"))
        assertEquals(30, calculator.calcular("6*5"))
    }

    @Test
    fun testDivision() {
        assertEquals(5, calculator.calcular("10/2"))
        assertEquals(2, calculator.calcular("6/3"))
    }
}