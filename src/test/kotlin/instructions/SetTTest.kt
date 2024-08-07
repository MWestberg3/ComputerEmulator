package instructions

import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.example.instructions.SetT
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SetTTest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)
    val setT = SetT("B3C0", cpu)
    @Test
    fun getTimer() {
        assertEquals("00111100", setT.timer)
    }
}