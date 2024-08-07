package instructions

import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.example.instructions.SwitchMemory
import org.junit.jupiter.api.Test

class SwitchMemoryTest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)
    val switchMemory = SwitchMemory("7000", cpu)
    @Test
    fun assignRegister() {
    }

    @Test
    fun getByte() {
    }

    @Test
    fun getAddress() {
    }
}