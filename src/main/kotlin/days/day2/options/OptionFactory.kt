package days.day2.options

fun createOption(option: String): Option {
    return when {
        Rock().keys.contains(option) -> return Rock()
        Paper().keys.contains(option) -> return Paper()
        Scissors().keys.contains(option) -> return Scissors()
        else -> Option()
    }
}