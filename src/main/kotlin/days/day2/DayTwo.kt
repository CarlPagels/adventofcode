package days.day2

import days.Day
import days.day2.options.createOption
import days.readFile

/*
What I play: A for Rock, B for Paper, and C for Scissors.
What u play: X for Rock, Y for Paper, and Z for Scissors
 */


class DayTwo : Day {

    override fun run() {
        println("Day two")
        println("Part one: ${partOne()}")
        println("Part two: ${partTwo()}")
    }

    private fun partOne(): Int {
        val rounds = getRounds()
        return Game(1).playGame(rounds)
    }

    private fun partTwo(): Int {
        val rounds = getRounds()
        return Game(2).playGame(rounds)
    }

    private fun getRounds() = readFile("src/main/kotlin/days/day2/input.txt")
        .split("\n")
        .map {
            it.split("\\s".toRegex())
                .map(::createOption)
        }
}