package days.day2.game

import days.day2.options.*
import days.readFile

open class Game {

    fun playGame(): Int {
        return getRounds()
            .map { playRound(it) }
            .reduce { acc, score -> acc + score }
    }

    private fun playRound(round: List<Option>): Int {
        val theirOption = round[0]
        val myOption = round[1]
        return play(myOption, theirOption)
    }

    open fun play(myOption: Option, theirOption: Option): Int {
        return 0
    }

    private fun getRounds() = readFile("day2.txt")
        .split("\n")
        .map {
            it.split("\\s".toRegex())
                .map(::createOption)
        }
}