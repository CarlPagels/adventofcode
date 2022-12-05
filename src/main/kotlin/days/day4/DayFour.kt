package days.day4

import days.Day
import days.createPair
import days.readFile

class DayFour : Day {
    override fun partOne(): String {
        return getPairs().filter { it.hasOverlapping() }.size.toString()
    }

    override fun partTwo(): String {
        return getPairs().filter { it.hasIntersecting() }.size.toString()
    }

    private fun getPairs(): List<Pair> {

        return readFile("day4.txt")
            .split("\n")
            .map { it.split(",") }
            .map { it.createPair() }
    }
}