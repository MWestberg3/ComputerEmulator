package org.example

fun main() {
    val ram = RAM()
    val rom = ROM("/Users/mwestberg/IdeaProjects/ComputerEmulator/roms/hello.d5700")
    val screen = Screen()
    val cpu = CPU(rom, ram, screen)
    cpu.loadRom()
}