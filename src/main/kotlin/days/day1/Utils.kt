import java.io.File

fun getElfCalories(): List<Int> {
    return getLines().split("\n\n")
        .map { removeNewLines(it) }
        .map(::sumCalories)
}

fun removeNewLines(line: String): String {
    return line.replace("\n", ",")
}

fun getLines(): String {
    return File("src/main/kotlin/days/day1/input.txt").readText()
}

private fun sumCalories(line: String): Int {
    return line.split(",")
        .map { it.toInt() }
        .reduce { acc, calories -> acc + calories }
}