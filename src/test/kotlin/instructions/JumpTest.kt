package instructions

import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.example.instructions.Jump
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class JumpTest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)
    val jump = Jump("5006", cpu)
    @Test
    fun getRegisterX() {
        assertNull(jump.registerX)
    }

    @Test
    fun getRegisterY() {
        assertNull(jump.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(jump.registerZ)
    }

    @Test
    fun getByte() {
        assertNull(jump.byte)
    }

    @Test
    fun getAddress() {
        assertEquals("000000000110", jump.address)
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