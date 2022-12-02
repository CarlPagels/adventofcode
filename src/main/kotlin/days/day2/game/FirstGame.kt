package days.day2.game

import days.day2.options.*

class FirstGame: Game() {
    override fun play(myOption: Option, theirOption: Option): Int {
        return when {
            myOption.keys.any { theirOption.losesTo == it } -> return myOption.score + 6
            myOption.keys.any { theirOption.drawsTo == it } -> return myOption.score + 3
            myOption.keys.any { theirOption.winsAgainst == it } -> return myOption.score + 0
            else -> 0
        }
    }
}