package days.day1

import days.Day
import days.readFile
import days.removeNewLines
import days.sumCalories

class DayOne : Day {

    override fun partOne(): String {
        return getElfCalories().max()
            .toString()
    }

    override fun partTwo(): String {
        return getElfCalories()
            .sortedByDescending { it }
            .take(3)
            .sumCalories()
            .toString()
    }

    private fun getElfCalories(): List<Int> {
        return readFile("day1.txt")
            .split("\n\n")
            .removeNewLines()
            .map(::sumCalories)
    }

    private fun sumCalories(line: String): Int {
        return line.split(",")
            .map { it.toInt() }
            .sumCalories()
    }
}