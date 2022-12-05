package days.day3

import days.Day
import days.readFile

class DayThree : Day {

    override fun partOne(): String {
        val scores = getRucksacks()
            .map(Rucksack::getScores)
        return scores.reduce { acc, score -> acc + score }
            .toString()
    }

    override fun partTwo(): String {
        return getGroups()
            .map(Group::findCommonItem)
            .reduce { acc, score -> acc + score }
            .toString()

    }

    private fun getGroups() = getRucksacks()
        .chunked(3)
        .map(::Group)

    private fun getRucksacks(): List<Rucksack> {
        return readFile("day3.txt")
            .split("\n")
            .map {
                val chunked = it.chunked(it.length / 2)
                val rucksack = Rucksack(chunked[0].toCharArray().toSet(), chunked[1].toCharArray().toSet())
                rucksack
            }
    }
}
