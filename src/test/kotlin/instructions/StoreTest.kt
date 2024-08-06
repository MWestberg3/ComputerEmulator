package instructions

import org.example.instructions.Store
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StoreTest {
    val store = Store("0048")

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
    fun assignRegister() {
    }

    @Test
    fun testGetByte() {
    }

    @Test
    fun testGetAddress() {
    }
}