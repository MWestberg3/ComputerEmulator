package org.example.instructions

class SetT(private val instruction: String) : Instruction(instruction) {
    override var registerX: String? = null
    override var registerY: String? = null
    override var registerZ: String? = null
    override var byte: String? = null
    override var address: String? = null
    override var timer: String? = this.instruction[1].toString().toInt(16).toString(2).padStart(4, '0') +
        this.instruction[2].toString().toInt(16).toString(2).padStart(4, '0')

    override fun assignRegister() {
    }

    override fun getByte() {
    }

    override fun getAddress() {
    }
}