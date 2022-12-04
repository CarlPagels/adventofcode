package days.day4


fun List<String>.createPair(): Pair {
    val firstElf = this[0].split("-")
    val secondElf = this[1].split("-")
    return Pair(
        Assigment(firstElf[0].toInt()..firstElf[1].toInt()),
        Assigment(secondElf[0].toInt()..secondElf[1].toInt())
    )
}