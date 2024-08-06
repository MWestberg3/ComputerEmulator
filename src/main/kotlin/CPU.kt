package org.example

import java.util.BitSet

class CPU {
    @OptIn(ExperimentalUnsignedTypes::class)
    var generalRegisters: UByteArray = UByteArray(8)
    var programCounter: BitSet = BitSet(16)
    var timerRegister: UByte = 0u
    var addressRegister: BitSet = BitSet(16)
    var memoryRegister: BitSet = BitSet(1)
}