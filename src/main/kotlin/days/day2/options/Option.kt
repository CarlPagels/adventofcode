package days.day2.options

interface Option {
    val score: Int
    val keys: List<String>
    fun winsAgainst(otherOption: Option): Boolean
    fun losesTo(otherOption: Option): Boolean
    fun drawsTo(otherOption: Option): Boolean
}
