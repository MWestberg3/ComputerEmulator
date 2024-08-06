package instructions

import org.example.instructions.Jump
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class JumpTest {
    val jump = Jump("5006")
    @Test
    fun getRegisterX() {
        assertNull(jump.registerX)
    }

    @Test
    fun getRegisterY() {
        assertNull(jump.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(jump.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(jump.byte)
    }

    @Test
    fun getAddress() {
        assertEquals("000000000110", jump.address)
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