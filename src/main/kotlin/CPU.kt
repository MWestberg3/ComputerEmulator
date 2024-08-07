package org.example

import org.example.instructions.Draw
import org.example.instructions.Store
import java.util.BitSet

class CPU(val rom: ROM, val ram: RAM, val screen: Screen) {
    @OptIn(ExperimentalUnsignedTypes::class)
    var generalRegisters: UByteArray = UByteArray(8)
    var programCounter: UShort = 0u
    var timerRegister: UByte = 0u
    var addressRegister: BitSet = BitSet(16)
    var memoryRegister: BitSet = BitSet(1)

    fun loadRom() {
        var endCondition: Boolean = false
        while (!endCondition) {
            val start = programCounter.toInt()
            val instruction = this.rom.data[start] + rom.data[start + 1]
            readInstruction(instruction)
            if (instruction == "0000")
                endCondition = true
        }
    }

    fun readInstruction(instruction: String) {
        if (instruction.isNotEmpty() && instruction[0] == '0') {
            val store = Store(instruction, this)
            store.execute()
        } else if (instruction.isNotEmpty() && instruction[0] == 'F') {
             val draw = Draw(instruction, this)
             draw.execute()
        }
    }

}