package days.day1

import days.Day
import days.readFile
import days.removeNewLines

class DayOne : Day {

    override fun partOne(): Int {
        return getElfCalories().maxOf { it }
    }

    override fun partTwo(): Int {
        return getElfCalories()
            .sortedByDescending { it }
            .take(3)
            .reduce { acc, calories -> acc + calories }
    }

    private fun getElfCalories(): List<Int> {
        return readFile("day1.txt")
            .split("\n\n")
            .map { removeNewLines(it) }
            .map(::sumCalories)
    }

    private fun sumCalories(line: String): Int {
        return line.split(",")
            .map { it.toInt() }
            .reduce { acc, calories -> acc + calories }
    }
}