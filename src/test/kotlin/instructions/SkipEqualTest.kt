package instructions

import org.example.instructions.SkipEqual
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SkipEqualTest {
    val skipEqual = SkipEqual("8010")
    @Test
    fun getRegisterX() {
        assertEquals("0000", skipEqual.registerX)
    }

    @Test
    fun getRegisterY() {
        assertEquals("0001", skipEqual.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(skipEqual.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(skipEqual.byte)
    }

    @Test
    fun getAddress() {
        assertNull(skipEqual.address)
    }

    @Test
    fun assignRegister() {
    }

    @Test
    fun testGetByte() {
    }

    @Test
    fun testGetAddress() {
    }
}