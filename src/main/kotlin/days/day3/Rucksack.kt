package days.day3

class Rucksack(private val firstCompartment: Set<Char>, private val secondCompartment: Set<Char>) {

    fun getAllItems(): Set<Char> {
        return firstCompartment + secondCompartment
    }

    fun getScores(): Int = firstCompartment
        .filter(secondCompartment::contains)
        .map(Char::toScore)[0]
}