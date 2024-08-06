import org.example.CPU
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

@OptIn(ExperimentalUnsignedTypes::class)
class CPUTest {
    var cpu = CPU()

    @Test
    fun getGeneralRegisters() {
        assertEquals(8, cpu.generalRegisters.size)
        assertEquals(0u, cpu.generalRegisters[0])
    }

    @Test
    fun setGeneralRegisters() {
        cpu.generalRegisters[0] = "1011".toUByte()
        assertEquals(11.toUByte(), cpu.generalRegisters[0])
    }

    @Test
    fun getProgramCounter() {
    }

    @Test
    fun setProgramCounter() {
    }

    @Test
    fun getTimerRegister() {
    }

    @Test
    fun setTimerRegister() {
    }

    @Test
    fun getAddressRegister() {
    }

    @Test
    fun setAddressRegister() {
    }

    @Test
    fun getMemoryRegister() {
    }

    @Test
    fun setMemoryRegister() {
    }
}