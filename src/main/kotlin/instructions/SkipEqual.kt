package org.example.instructions

import org.example.CPU

class SkipEqual(private val instruction: String, cpu: CPU) : Instruction(instruction, cpu,) {
    override var registerX: String? = this.instruction[1].toString().toInt(16).toString(2).padStart(4, '0')
    override var registerY: String? = this.instruction[2].toString().toInt(16).toString(2).padStart(4, '0')
    override var registerZ: String? = null
    override var byte: String? = null
    override var address: String? = null
    override var timer: String? = null

    override fun assignRegister() {
    }

    override fun getByte() {
    }

    override fun getAddress() {
    }

    override fun incrementProgramCounter() {
        TODO("Not yet implemented")
    }
}