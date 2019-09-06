package guru.springframework

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MoneyTest {

    @Test
    fun testMultiplicationDollar() {

        assertEquals(Money().dollar(10),Money().dollar(5).times(2))
        assertEquals(Money().dollar(15),Money().dollar(5).times(3))
    }
    @Test
    fun testEqualityDollar(){
        assertEquals(Money().dollar(5),Money().dollar(5))
        assertNotEquals(Money().dollar(5),Dollar(3))
        //assertNotEquals(Dollar(5),Franc(5))
    }
    @Test
    fun testMultiplicationFranc() {
        assertEquals(Money().franc(10),Money().franc(5).times(2))
        assertEquals(Money().franc(15),Money().franc(5).times(3))
    }
    @Test
    fun testEqualityFranc(){
        assertEquals(Money().franc(5),Money().franc(5))
        assertNotEquals(Money().franc(5),Money().franc(3))
    }

}