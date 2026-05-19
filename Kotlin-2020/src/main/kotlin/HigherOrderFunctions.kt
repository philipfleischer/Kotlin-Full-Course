
fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach {
        if(predicate(it)) {
            println(it)
        }
    }
}

fun main() {
    val list = listOf("Kotlin", "Java", "C++", "JavaScript")
    printFilteredStrings(list, { it.startsWith("K") })

    println()
    printFilteredStrings(list, { it.startsWith("J") })

    println()
    printFilteredStrings(list) {
        it.startsWith("J")
    }
}