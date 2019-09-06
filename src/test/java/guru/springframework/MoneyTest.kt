package guru.springframework

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MoneyTest {

    @Test
    fun testMultiplicationDollar() {
        val five = Dollar(5)
        var product=five.times(2)
        assertEquals(Dollar(10),product)
        product=five.times(3)
        assertEquals(Dollar(15),product)
    }
    @Test
    fun testEqualityDollar(){
        assertEquals(Dollar(5),Dollar(5))
        assertNotEquals(Dollar(5),Dollar(3))
    }
    @Test
    fun testMultiplicationFranc() {
        val five = Franc(5)
        var product=five.times(2)
        assertEquals(Franc(10),product)
        product=five.times(3)
        assertEquals(Franc(15),product)
    }
    @Test
    fun testEqualityFranc(){
        assertEquals(Franc(5),Franc(5))
        assertNotEquals(Franc(5),Franc(3))
    }

}