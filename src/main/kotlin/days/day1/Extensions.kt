package days.day1

fun List<Int>.sumCalories(): Int {
    return this.reduce { acc, calories -> acc + calories }
}