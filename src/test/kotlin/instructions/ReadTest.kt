package instructions

import org.example.instructions.Read
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ReadTest {
    val read = Read("3000")
    @Test
    fun getRegisterX() {
        assertEquals("0000", read.registerX)
    }

    @Test
    fun getRegisterY() {
        assertNull(read.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(read.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(read.byte)
    }

    @Test
    fun getAddress() {
        assertNull(read.address)
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