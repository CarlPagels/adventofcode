package days.day2.options

class Rock: Option() {

    override val score: Int
        get() = 1
    override val keys: List<String>
        get() = listOf("A", "X")
    override val winsAgainst: String
        get() = "Z"
    override val losesTo: String
        get() = "Y"
    override val drawsTo: String
        get() = "X"

    override fun toString(): String {
        return "Rock"
    }
}