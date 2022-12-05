package days.day5

import days.Day
import days.day5.cratemover.CrateMoverFactory
import days.getAllDigits
import days.getTopItems
import days.readFile

class DayFive : Day {

    override fun partOne(): String {
        return moveCrates(1)
    }

    override fun partTwo(): String {
        return moveCrates(2)
    }

    private fun createColumns(): MutableMap<Int, List<Char>> {
        return mutableMapOf(
            Pair(1, "MSJLVFNR".toList()),
            Pair(2, "HWJFZDNP".toList()),
            Pair(3, "GDCRW".toList()),
            Pair(4, "SBN".toList()),
            Pair(5, "NFBCPWZM".toList()),
            Pair(6, "WMRP".toList()),
            Pair(7, "WSLGNTR".toList()),
            Pair(8, "VBNFHTQ".toList()),
            Pair(9, "FNZHML".toList())
        )
    }

    private fun getInstructions(): List<Instruction> {
        return readFile("day5.txt")
            .split("\n")
            .getAllDigits()
            .map { Instruction(it[0], it[1], it[2]) }
    }

    private fun moveCrates(part: Int): String {
        val columns = createColumns()
        val crateMover = CrateMoverFactory().getCrateMover(part)
        getInstructions().forEach { crateMover.moveCrates(columns, it) }

        return columns.values
            .getTopItems()
            .flatten()
            .joinToString("")
    }
}