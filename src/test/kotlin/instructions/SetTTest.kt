package instructions

import org.example.instructions.SetT
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SetTTest {
    val setT = SetT("B3C0")
    @Test
    fun getTimer() {
        assertEquals("00111100", setT.timer)
    }
}