package days.day2

import days.Day
import days.day2.game.getGame

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
        return getGame(1).playGame()
    }

    private fun partTwo(): Int {
        return getGame(2).playGame()
    }
}