package org.example.instructions

import org.example.CPU

class ReadT(private val instruction: String, cpu: CPU) : Instruction(instruction, cpu,) {
    override var registerX: String? = null
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