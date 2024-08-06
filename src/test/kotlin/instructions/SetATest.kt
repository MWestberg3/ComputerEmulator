package instructions

import org.example.CPU
import org.example.instructions.SetA
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SetATest {
    val cpu = CPU()
    val setA = SetA("A255", cpu)
    @Test
    fun getRegisterX() {
        assertNull(setA.registerX)
    }

    @Test
    fun getRegisterY() {
        assertNull(setA.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(setA.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(setA.byte)
    }

    @Test
    fun getAddress() {
        assertEquals("001001010101", setA.address)
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