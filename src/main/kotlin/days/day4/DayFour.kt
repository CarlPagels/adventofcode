package days.day4

import days.Day
import days.readFile

class DayFour : Day {
    override fun partOne(): Int {
        return getPairs().filter { it.hasOverlapping() }.size
    }

    override fun partTwo(): Int {
        return getPairs().filter { it.hasIntersecting() }.size
    }

    private fun getPairs(): List<Pair> {
        val pairs = readFile("day4.txt")
            .split("\n")
            .map { it.split(",") }

        return pairs.map { it.createPair() }
    }
}