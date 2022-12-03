package days

import java.io.File

fun readFile(filePath: String): String {
    return File("src/main/kotlin/inputfiles/$filePath").readText()
}