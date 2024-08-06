package org.example.instructions

class Jump(private val instruction: String): Instruction(instruction) {
    override var registerX: String? = null
    override var registerY: String? = null
    override var registerZ: String? = null
    override var byte: String? = null
    override var address: String? = this.instruction.substring(1).toInt(16).toString(2).padStart(12, '0')
    override var timer: String? = null

    override fun assignRegister() {
    }

    override fun getByte() {
    }

    override fun getAddress() {
    }
}