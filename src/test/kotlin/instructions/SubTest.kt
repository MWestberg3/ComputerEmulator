package instructions

import org.example.CPU
import org.example.instructions.Sub
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

@OptIn(ExperimentalUnsignedTypes::class)
class SubTest {
    val cpu = CPU()
    val sub = Sub("2010", cpu)
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
    fun executeTest() {
        cpu.generalRegisters[0] = 14.toUByte()
        cpu.generalRegisters[1] = 3.toUByte()
        sub.execute()
        assertEquals(11.toUByte(), sub.cpu.generalRegisters[0])
    }

    @Test
    fun testGetByte() {
    }

    @Test
    fun testGetAddress() {
    }
}