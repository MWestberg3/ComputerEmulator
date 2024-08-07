package instructions

import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.example.instructions.SkipEqual
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SkipEqualTest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)
    val skipEqual = SkipEqual("8010", cpu)
    @Test
    fun getRegisterX() {
        assertEquals("0000", skipEqual.registerX)
    }

    @Test
    fun getRegisterY() {
        assertEquals("0001", skipEqual.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(skipEqual.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(skipEqual.byte)
    }

    @Test
    fun getAddress() {
        assertNull(skipEqual.address)
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