package org.example.instructions

abstract class Instruction(private val instruction: String) {
    abstract var registerX: String?
    abstract var registerY: String?
    abstract var registerZ: String?
    abstract var byte: String?
    abstract var address: String?
    abstract var timer: String?

    fun execute() {
        
    }

    abstract fun assignRegister()

    abstract fun getByte()

    abstract fun getAddress()
}