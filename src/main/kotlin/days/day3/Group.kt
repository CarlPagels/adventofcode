package days.day3

import days.toScore

class Group(private val members: List<Rucksack>) {

    fun findCommonItem(): Int {
        return members[0].getAllItems().filter {
            it in members[1].getAllItems() && it in members[2].getAllItems()
        }[0].toScore()
    }
}