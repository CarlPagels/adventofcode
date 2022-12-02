package days

import java.io.File

fun removeNewLines(line: String): String {
    return line.replace("\n", ",")
}

fun readFile(filePath: String): String {
    return File(filePath).readText()
}