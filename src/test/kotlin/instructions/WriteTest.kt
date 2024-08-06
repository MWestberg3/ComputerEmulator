package instructions

import org.example.instructions.Write
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class WriteTest {
    val write = Write("4700")
    @Test
    fun getRegisterX() {
        assertEquals("0111", write.registerX)
    }

    @Test
    fun getRegisterY() {
        assertNull(write.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(write.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(write.byte)
    }

    @Test
    fun getAddress() {
        assertNull(write.address)
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