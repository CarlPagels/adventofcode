package days.day2.options

fun createOption(option: String): Option {
    return when {
        Rock().keys.contains(option) -> Rock()
        Paper().keys.contains(option) -> Paper()
        Scissors().keys.contains(option) -> Scissors()
        else -> Rock()
    }
}