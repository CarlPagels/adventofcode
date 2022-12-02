package days.day2.game

import days.day2.options.Option
import days.day2.options.Paper
import days.day2.options.Rock
import days.day2.options.Scissors

class SecondGame: Game() {

    override fun play(myOption: Option, theirOption: Option): Int {
        val gameResult = when(myOption) {
            is Rock -> "Loss"
            is Paper -> "Draw"
            is Scissors -> "Win"
            else -> ""
        }

        when (theirOption) {
            is Rock -> {
                return when(gameResult) {
                    "Loss" -> Scissors().score + 0
                    "Draw" -> Rock().score + 3
                    "Win" -> Paper().score + 6
                    else -> 0
                }
            }
            is Paper -> {
                return when(gameResult) {
                    "Loss" -> Rock().score + 0
                    "Draw" -> Paper().score + 3
                    "Win" -> Scissors().score + 6
                    else -> 0
                }
            }
            is Scissors -> {
                return when(gameResult) {
                    "Loss" -> Paper().score + 0
                    "Draw" -> Scissors().score + 3
                    "Win" -> Rock().score + 6
                    else -> 0
                }
            }
            else -> return 0
        }
    }
}