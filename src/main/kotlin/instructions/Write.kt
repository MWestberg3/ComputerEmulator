package org.example.instructions

import org.example.CPU

class Write(private val instruction: String, cpu: CPU): Instruction(instruction, cpu,) {
    override var registerX: String? = this.instruction[1].toString().toInt(16).toString(2).padStart(4, '0')
    override var registerY: String? = null
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
        cpu.programCounter = (cpu.programCounter.toInt() + 2).toUShort()
    }
}