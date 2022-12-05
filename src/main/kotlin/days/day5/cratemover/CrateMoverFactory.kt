package days.day5.cratemover

class CrateMoverFactory {

    fun getCrateMover(part: Int): CrateMover {
        return if (part == 1) CrateMover9000() else CrateMover9001()
    }

}