import org.example.CPU
import org.example.RAM
import org.example.ROM
import org.example.Screen
import org.junit.jupiter.api.Test

@OptIn(ExperimentalUnsignedTypes::class)
class CPUTest {
    private val screen = Screen()
    private val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val cpu = CPU(rom, ram, screen)

    @Test
    fun getGeneralRegisters() {
    }

    @Test
    fun setGeneralRegisters() {
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

    @Test
    fun readInstruction() {
        val filePath = "/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700"
        cpu.readInstruction(filePath)
    }
}