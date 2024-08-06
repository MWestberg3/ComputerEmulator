package org.example.instructions

class SkipEqual(private val instruction: String) : Instruction(instruction) {
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
}