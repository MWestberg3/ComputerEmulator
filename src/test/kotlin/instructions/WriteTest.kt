package instructions

import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.example.instructions.Write
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class WriteTest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)
    val write = Write("4700", cpu)
    @Test
    fun getRegisterX() {
        assertEquals("0111", write.registerX)
    }

    @Test
    fun getRegisterY() {
        assertNull(write.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(write.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(write.byte)
    }

    @Test
    fun getAddress() {
        assertNull(write.address)
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