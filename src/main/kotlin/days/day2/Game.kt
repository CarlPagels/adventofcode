package days.day2

import days.day2.options.Option

class Game(private val roundNumber: Int) {

    fun playGame(rounds: List<List<Option>>): Int {
        return rounds
            .map { playRound(it) }
            .reduce { acc, score -> acc + score }
    }

    private fun playRound(round: List<Option>): Int {
        val theirOption = round[0]
        val myOption = round[1]
        if (roundNumber == 1) {
            return myOption.play(theirOption)
        }
        return myOption.playPartTwo(theirOption)
    }
}