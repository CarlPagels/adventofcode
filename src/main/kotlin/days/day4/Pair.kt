package days.day4

class Pair(private val firstElf: Assigment, private val secondElf: Assigment) {

    fun hasOverlapping(): Boolean {
        return firstElf.isWithin(secondElf) || secondElf.isWithin(firstElf)
    }

    fun hasIntersecting(): Boolean {
        return firstElf.intersects(secondElf)
    }

    override fun toString(): String {
        return "$firstElf | $secondElf"
    }
}