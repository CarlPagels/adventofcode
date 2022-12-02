package days.day2.options

open class Option {
    open val score: Int = 0
    open val keys: List<String> = emptyList()
    open val winsAgainst: String = ""
    open val losesTo: String = ""
    open val drawsTo: String = ""

    open fun play(theirOption: Option): Int {
        return when {
            this.keys.any { myOption -> theirOption.losesTo == myOption } -> return score + 6
            this.keys.any { myOption -> theirOption.drawsTo == myOption } -> return score + 3
            this.keys.any { myOption -> theirOption.winsAgainst == myOption } -> return score + 0
            else -> 0
        }
    }

    open fun playPartTwo(theirOption: Option): Int {
        val gameResult = when(this) {
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
