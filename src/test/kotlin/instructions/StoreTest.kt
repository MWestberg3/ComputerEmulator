package instructions

import org.example.CPU
import org.example.instructions.Store
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

@OptIn(ExperimentalUnsignedTypes::class)
class StoreTest {
    val cpu = CPU()
    val store = Store("0048", cpu)

    @Test
    fun execute() {
    }

    @Test
    fun getRegisterX() {
        assertEquals("0000", store.registerX)
    }

    @Test
    fun getRegisterY() {
        assertNull(store.registerY)
    }

    @Test
    fun getRegisterZ() {
        assertNull(store.registerZ)
    }

    @Test
    fun getByte() {
        assertEquals("01001000", store.byte)
    }

    @Test
    fun getAddress() {
        assertNull(store.address)
    }

    @Test
    fun executeTest() {
        store.execute()
        assertEquals(72.toUByte(), store.cpu.generalRegisters[0])
    }

    @Test
    fun testGetByte() {
    }

    @Test
    fun testGetAddress() {
    }
}