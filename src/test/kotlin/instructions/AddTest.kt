package instructions

import org.example.CPU
import org.example.instructions.Add
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

@OptIn(ExperimentalUnsignedTypes::class)
class AddTest {
    val cpu = CPU()
    val add = Add("1010", cpu)
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
    fun executeTest() {
        cpu.generalRegisters[0] = 14.toUByte()
        cpu.generalRegisters[1] = 3.toUByte()
        add.execute()
        assertEquals(17.toUByte(), add.cpu.generalRegisters[0])
    }

    @Test
    fun testGetByte() {
    }

    @Test
    fun testGetAddress() {
    }
}