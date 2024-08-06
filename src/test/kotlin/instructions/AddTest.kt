package instructions

import org.example.instructions.Add
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AddTest {
    val add = Add("1010")
    @Test
    fun getRegisterX() {
        assertEquals("0000", add.registerX)
    }

    @Test
    fun getRegisterY() {
        assertEquals("0001", add.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertEquals("0000", add.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(add.byte)
    }

    @Test
    fun getAddress() {
        assertNull(add.address)
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