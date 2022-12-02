package days.day2.options

class Scissors: Option {
    override val score: Int = 3
    override val keys: List<String> = listOf("C", "Z")

    override fun winsAgainst(otherOption: Option): Boolean {
        return otherOption is Paper
    }

    override fun losesTo(otherOption: Option): Boolean {
        return otherOption is Rock
    }

    override fun drawsTo(otherOption: Option): Boolean {
        return otherOption is Scissors
    }

    override fun toString(): String {
        return "Scissors"
    }
}