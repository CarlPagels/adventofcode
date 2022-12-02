package days.day2.options

class Paper : Option() {
    override val score: Int
        get() = 2
    override val keys: List<String>
        get() = listOf("B", "Y")
    override val winsAgainst: String
        get() = "X"
    override val losesTo: String
        get() = "Z"
    override val drawsTo: String
        get() = "Y"

    override fun toString(): String {
        return "Paper"
    }


}