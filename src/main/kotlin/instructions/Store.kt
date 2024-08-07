package org.example.instructions

import org.example.CPU
import java.util.*

class Store(private val instruction: String, cpu: CPU) : Instruction(instruction, cpu,) {
    override var registerX: String? = this.instruction[1].toString().toInt(16).toString(2).padStart(4, '0')
    override var registerY: String? = null
    override var registerZ: String? = null
    override var byte: String? = this.instruction[2].toString().toInt(16).toString(2).padStart(4, '0') + this.instruction[3].toString().toInt(16).toString(2).padStart(4, '0')
    override var address: String? = null
    override var timer: String? = null

    @OptIn(ExperimentalUnsignedTypes::class)
    override fun assignRegister() {
        cpu.generalRegisters[binaryStringToInt(this.registerX!!)] = binaryStringToInt(this.byte!!).toUByte()
    }

    override fun getByte() {
    }

    override fun getAddress() {
    }

    override fun incrementProgramCounter() {
        cpu.programCounter = (cpu.programCounter.toInt() + 2).toUShort()
    }

}