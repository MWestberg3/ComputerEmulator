package instructions

import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.example.instructions.Read
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ReadTest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)
    val read = Read("3000", cpu)
    @Test
    fun getRegisterX() {
        assertEquals("0000", read.registerX)
    }

    @Test
    fun getRegisterY() {
        assertNull(read.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(read.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(read.byte)
    }

    @Test
    fun getAddress() {
        assertNull(read.address)
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