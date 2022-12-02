package days.day2.game

import days.day2.options.*

open class Game {

    fun playGame(rounds: List<List<Option>>): Int {
        return rounds
            .map { playRound(it) }
            .reduce { acc, score -> acc + score }
    }

    private fun playRound(round: List<Option>): Int {
        val theirOption = round[0]
        val myOption = round[1]
        return calculateScore(myOption, theirOption)
    }

    open fun calculateScore(myOption: Option, theirOption: Option): Int {
        return 0
    }
}