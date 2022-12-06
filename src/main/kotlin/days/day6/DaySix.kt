package days.day6

import days.Day
import days.findUniqueCombination
import days.readFile

class DaySix : Day {
    override fun partOne(): String {
        return getSignal().findUniqueCombination(4)
    }

    override fun partTwo(): String {
        return getSignal().findUniqueCombination(14)
    }

    private fun getSignal(): String {
        return readFile("day6.txt")
    }
}