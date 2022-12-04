package days.day4

class Assigment(private val range: IntRange) {

    fun isWithin(otherAssigment: Assigment): Boolean {
        return otherAssigment.range.min() >= this.range.min() && otherAssigment.range.max() <= this.range.max()
    }

    fun intersects(secondElf: Assigment): Boolean {
        return this.range.intersect(secondElf.range).isNotEmpty()
    }

}