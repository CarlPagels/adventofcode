package days.day2.options

class Scissors: Option() {
    override val score: Int
        get() = 3
    override val keys: List<String>
        get() = listOf("C", "Z")
    override val winsAgainst: String
        get() = "Y"
    override val losesTo: String
        get() = "X"
    override val drawsTo: String
        get() = "Z"

    override fun toString(): String {
        return "Scissors"
    }

}