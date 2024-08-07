package instructions

import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.example.instructions.SetA
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SetATest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)
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