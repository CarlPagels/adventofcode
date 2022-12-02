package days.day2.game

fun getGame(part: Int): Game {
    return when(part) {
        1 -> FirstGame()
        else -> SecondGame()
    }
}