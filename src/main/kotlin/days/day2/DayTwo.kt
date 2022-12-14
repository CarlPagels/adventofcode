package days.day2

import days.Day
import days.day2.game.playGame
import days.day2.options.createOption
import days.readFile

/*
What I play: A for Rock, B for Paper, and C for Scissors.
What u play: X for Rock, Y for Paper, and Z for Scissors
 */


class DayTwo : Day {

    override fun partOne(): String {
        return playGame(getRounds(), 1)
            .toString()
    }

    override fun partTwo(): String {
        return playGame(getRounds(), 2)
            .toString()
    }

    private fun getRounds() = readFile("day2.txt")
        .split("\n")
        .map {
            it.split("\\s".toRegex())
                .map(::createOption)
        }
}