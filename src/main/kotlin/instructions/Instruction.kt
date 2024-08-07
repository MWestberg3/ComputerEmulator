package org.example.instructions

import org.example.CPU

abstract class Instruction(private val instruction: String, val cpu: CPU) {
    abstract var registerX: String?
    abstract var registerY: String?
    abstract var registerZ: String?
    abstract var byte: String?
    // address is a 16-bit value that is used for STORING an address
    // program counter is what will get incremented/decremented by the instruction
    abstract var address: String?
    abstract var timer: String?

    fun execute() {
        assignRegister()
        getAddress()
        incrementProgramCounter()
        decrementTimer()
    }

    private fun decrementTimer() {
        cpu.timerRegister = (cpu.timerRegister.toInt() - 1).toUByte()
    }

    fun binaryStringToInt(binaryString: String): Int {
        return binaryString.toInt(2)
    }

    abstract fun assignRegister()

    abstract fun getByte()

    abstract fun getAddress()

    // program counter should always increment by 2, unless it's a jump instruction!
    abstract fun incrementProgramCounter()

}
