package days

import days.day3.Items
import days.day4.Assigment
import days.day4.Pair


fun List<String>.removeNewLines(): List<String> {
    return this.map { it.replace("\n", ",") }
}

fun List<Int>.sumCalories(): Int {
    return this.reduce { acc, calories -> acc + calories }
}

fun List<String>.getAllDigits(): List<List<Int>> {
    return this.map { line ->
        line.replace("move", "")
            .replace(" from", "")
            .replace(" to", "")
            .split(" ")
            .filter { it.isNotEmpty() }
            .map { it.toInt() }
    }
}

fun MutableCollection<List<Char>>.getTopItems(): List<List<Char>> {
    return this.map { it.take(1) }
}

fun List<String>.createPair(): Pair {
    val firstElf = this[0].split("-")
    val secondElf = this[1].split("-")
    return Pair(
        Assigment(firstElf[0].toInt()..firstElf[1].toInt()),
        Assigment(secondElf[0].toInt()..secondElf[1].toInt())
    )
}

fun Char.toScore(): Int {
    val baseScore = Items().scoreOf(this.uppercaseChar())
    return when {
        this.isUpperCase() -> baseScore + 26
        else -> baseScore
    }
}

fun String.findUniqueCombination(amount: Int): String {
    val characters = this.toCharArray().toList()
    characters.forEachIndexed { index, _ ->
        val uniqueCharacters = characters.subList(index, index + amount).toSet()
        if (uniqueCharacters.size == amount) {
            return (index + amount).toString()
        }

    }
    return ""
}