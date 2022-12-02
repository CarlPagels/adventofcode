package days.day2.game

import days.day2.options.*

class FirstGame: Game() {
    override fun play(myOption: Option, theirOption: Option): Int {
        return when {
            myOption.winsAgainst(theirOption) -> myOption.score + 6
            myOption.drawsTo(theirOption) -> myOption.score + 3
            myOption.losesTo(theirOption) -> myOption.score
            else -> 0
        }
    }
}