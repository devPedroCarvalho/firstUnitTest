package app.devpedrocarvalho.firstunittest

import org.junit.Test

import org.junit.Assert.*

class TaxTest {

    @Test
    fun calculateTax() {
        val tax = Tax()
        val netTax = tax.calculateTax(100.0,0.1)
        assertEquals(netTax,10.0,0.0)
    }

    @Test
    fun calculateIncome() {
        val tax = Tax()
        val netIncome = tax.calculateIncome(100.0,0.1)
        assertEquals(netIncome,90.0,0.0)
    }
}