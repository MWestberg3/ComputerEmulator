package instructions

import org.example.CPU
import org.example.instructions.SwitchMemory
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SwitchMemoryTest {
    val cpu = CPU()
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