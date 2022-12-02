package days.day1

import days.Day
import getElfCalories

class DayOne : Day {

    override fun run() {
        println("Part one: ${partOne()}")
        println("Part two: ${partTwo()}")

    }

    private fun partOne(): Int {
        return getElfCalories().maxOf { it }
    }

    private fun partTwo(): Int {
        return getElfCalories()
            .sortedByDescending { it }
            .take(3)
            .reduce { acc, calories -> acc + calories }
    }
}