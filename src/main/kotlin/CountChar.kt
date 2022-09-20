fun main() {
    var name = "Noor"
    println(name.getCharCount('o'))

}

fun String.getCharCount(ch: Char): Int {
    var count = 0
    for (c in this) if (c == ch) count++
    return count
}
