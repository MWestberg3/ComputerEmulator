package instructions

import org.example.instructions.SkipNotEqual
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SkipNotEqualTest {
    val skipNotEqual = SkipNotEqual("9030")
    @Test
    fun getRegisterX() {
        assertEquals("0000", skipNotEqual.registerX)
    }

    @Test
    fun getRegisterY() {
        assertEquals("0011", skipNotEqual.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(skipNotEqual.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(skipNotEqual.byte)
    }

    @Test
    fun getAddress() {
        assertNull(skipNotEqual.address)
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