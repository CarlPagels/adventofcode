package days


fun String.removeNewLines(): String {
    return this.replace("\n", ",")
}