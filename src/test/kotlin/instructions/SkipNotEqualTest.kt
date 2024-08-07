package instructions

import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.example.instructions.SkipNotEqual
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SkipNotEqualTest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)
    val skipNotEqual = SkipNotEqual("9030", cpu)
    @Test
    fun getRegisterX() {
        assertEquals("0000", skipNotEqual.registerX)
    }

    @Test
    fun getRegisterY() {
        assertEquals("0011", skipNotEqual.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(skipNotEqual.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(skipNotEqual.byte)
    }

    @Test
    fun getAddress() {
        assertNull(skipNotEqual.address)
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