package days.day2.options

class Rock: Option {
    override val score: Int = 1
    override val keys: List<String> = listOf("A", "X")

    override fun winsAgainst(otherOption: Option): Boolean {
        return otherOption is Scissors
    }

    override fun losesTo(otherOption: Option): Boolean {
        return otherOption is Paper
    }

    override fun drawsTo(otherOption: Option): Boolean {
        return otherOption is Rock
    }

    override fun toString(): String {
        return "Rock"
    }
}