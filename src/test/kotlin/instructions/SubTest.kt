package instructions

import org.example.instructions.Sub
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SubTest {
    val sub = Sub("2010")
    @Test
    fun getRegisterX() {
        assertEquals("0000", sub.registerX)
    }

    @Test
    fun getRegisterY() {
        assertEquals("0001", sub.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertEquals("0000", sub.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(sub.byte)
    }

    @Test
    fun getAddress() {
        assertNull(sub.address)
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