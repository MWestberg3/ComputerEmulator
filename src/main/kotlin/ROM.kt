package org.example

import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

class ROM(filePath: String) {
    val data: List<String>

    init {
        val file = File(filePath)
        require(file.length() <= 4096) { "File size exceed 4kb"}
        data = Files.readAllLines(Paths.get(filePath)).flatMap { it.chunked(2) }
    }
}