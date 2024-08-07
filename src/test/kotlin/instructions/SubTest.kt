package instructions

import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.example.instructions.Sub
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

@OptIn(ExperimentalUnsignedTypes::class)
class SubTest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)
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