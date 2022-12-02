package days.day2.options

class Paper : Option {
    override val score: Int = 2
    override val keys: List<String> = listOf("B", "Y")

    override fun winsAgainst(otherOption: Option): Boolean {
        return otherOption is Rock
    }

    override fun losesTo(otherOption: Option): Boolean {
        return otherOption is Scissors
    }

    override fun drawsTo(otherOption: Option): Boolean {
        return otherOption is Paper
    }

    override fun toString(): String {
        return "Paper"
    }
}