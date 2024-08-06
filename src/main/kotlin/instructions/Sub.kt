package org.example.instructions

import org.example.CPU

class Sub(private val instruction: String, cpu: CPU): Instruction(instruction, cpu,) {
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
        cpu.generalRegisters[z] = (cpu.generalRegisters[x] - cpu.generalRegisters[y]).toUByte()
    }

    override fun getByte() {
    }

    override fun getAddress() {
    }

    override fun incrementProgramCounter() {
        TODO("Not yet implemented")
    }
}