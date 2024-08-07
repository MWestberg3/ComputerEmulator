package org.example

class RAM {
    var memory: ByteArray = ByteArray(4096)

    fun write(address: Int, value: Char) {
        memory[address] = value.code.toByte()
    }
}