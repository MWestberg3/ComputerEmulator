package org.example.instructions

import org.example.CPU

class Draw(private val instruction: String, cpu: CPU) : Instruction(instruction, cpu) {
    override var registerX: String? = this.instruction[1].toString().toInt(16).toString(2).padStart(4, '0')
    override var registerY: String? = this.instruction[2].toString().toInt(16).toString(2).padStart(4, '0')
    override var registerZ: String? = this.instruction[3].toString().toInt(16).toString(2).padStart(4, '0')
    override var byte: String? = null
    override var address: String? = null
    override var timer: String? = null

    @OptIn(ExperimentalUnsignedTypes::class)
    override fun assignRegister() {
        val x = binaryStringToInt(this.registerX!!)
        val y = binaryStringToInt(this.registerY!!)
        val z = binaryStringToInt(this.registerZ!!)

        val value = cpu.generalRegisters[x].toInt()
        if (value > 127) {
            throw IllegalArgumentException("Value in registerX exceeds 127")
        }

        cpu.screen.write(y, z, value.toChar())
    }

    override fun getByte() {
    }

    override fun getAddress() {
    }

    override fun incrementProgramCounter() {
        cpu.programCounter = (cpu.programCounter.toInt() + 2).toUShort()
    }
}