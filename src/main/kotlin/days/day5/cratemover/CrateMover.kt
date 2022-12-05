package days.day5.cratemover

import days.day5.Instruction

interface CrateMover {

    fun moveCrates(columns: MutableMap<Int, List<Char>>, instruction: Instruction)
}