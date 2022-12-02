package days.day2.game

import days.day2.options.Option

fun playGame(rounds: List<List<Option>>, part: Int): Int {
    return when(part) {
        1 -> FirstGame().playGame(rounds)
        2 -> SecondGame().playGame(rounds)
        else -> 0
    }
}