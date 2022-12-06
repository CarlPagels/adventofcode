import days.Day
import days.day1.DayOne
import days.day2.DayTwo
import days.day3.DayThree
import days.day4.DayFour
import days.day5.DayFive
import days.day6.DaySix

fun main() {

    val days: List<Day> = listOf(
        DayOne(),
        DayTwo(),
        DayThree(),
        DayFour(),
        DayFive(),
        DaySix()
    )
    days.forEachIndexed { index, day ->
        println("Day ${index + 1}")
        println("Part one: ${day.partOne()}")
        println("Part two: ${day.partTwo()}")
        println("----------------------")
    }
}