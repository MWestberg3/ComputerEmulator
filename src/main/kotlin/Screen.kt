package org.example

class Screen {
    private val screen = Array(8) { Array(8) { 0 } }

    fun write(row: Int, col: Int, value: Char) {
        screen[row][col] = value.code
        printScreen()
    }

    private fun printScreen() {
        for (row in screen) {
            for (col in row) {
                print("${col.toChar()} ")
            }
            println()
        }
        print("\n= = = = = = = = \n\n")
    }
}