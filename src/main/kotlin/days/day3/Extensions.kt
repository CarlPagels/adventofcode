package days.day3

fun Char.toScore(): Int {
    val baseScore = Items().scoreOf(this.uppercaseChar())
    return when {
        this.isUpperCase() -> baseScore + 26
        else -> baseScore
    }
}