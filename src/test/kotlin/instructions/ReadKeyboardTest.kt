package instructions

import org.example.instructions.ReadKeyboard
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ReadKeyboardTest {
    val readKeyboard = ReadKeyboard("6000")
    @Test
    fun getRegisterX() {
        assertEquals("0000", readKeyboard.registerX)
    }

    @Test
    fun getRegisterY() {
        assertNull(readKeyboard.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(readKeyboard.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(readKeyboard.byte)
    }

    @Test
    fun getAddress() {
        assertNull(readKeyboard.address)
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