package days.day5.cratemover

import days.day5.Instruction

class CrateMover9000 : CrateMover {

    override fun moveCrates(columns: MutableMap<Int, List<Char>>, instruction: Instruction) {
        val originValues = columns[instruction.origin]!!.toMutableList()
        val destinationValues = columns[instruction.destination]!!.toMutableList()
        destinationValues.addAll(0, originValues.take(instruction.amount).reversed())
        columns[instruction.destination] = destinationValues
        columns[instruction.origin] = originValues.drop(instruction.amount).toMutableList()
    }

}