package instructions

import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.example.instructions.ReadKeyboard
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ReadKeyboardTest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)
    val readKeyboard = ReadKeyboard("6000", cpu)
    @Test
    fun getRegisterX() {
        assertEquals("0000", readKeyboard.registerX)
    }

    @Test
    fun getRegisterY() {
        assertNull(readKeyboard.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(readKeyboard.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(readKeyboard.byte)
    }

    @Test
    fun getAddress() {
        assertNull(readKeyboard.address)
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