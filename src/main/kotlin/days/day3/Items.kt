package days.day3

data class Items(
    private val itemList: List<Char> = listOf(
        'A',
        'B',
        'C',
        'D',
        'E',
        'F',
        'G',
        'H',
        'I',
        'J',
        'K',
        'L',
        'M',
        'N',
        'O',
        'P',
        'Q',
        'R',
        'S',
        'T',
        'U',
        'V',
        'W',
        'X',
        'Y',
        'Z'
    )
) {

    fun scoreOf(char: Char): Int {
        return itemList.indexOf(char) + 1
    }
}
