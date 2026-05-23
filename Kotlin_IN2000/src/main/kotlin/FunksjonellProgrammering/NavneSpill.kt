package FunksjonellProgrammering

data class Name(val id: String, val name: String, val popularity: Int)

fun readSSB(): List<Name> {
    val nameTemp = Name("ae23133", "Philip", 32)
    val nameTem2 = Name("pp20922", "Ole", 78)
    val nameTem3 = Name("EL90290", "Sander", 45)
    val nameTem4 = Name("ll85754", "Helmer", 98)
    val nameTem5 = Name("zx33223", "Jon-Martin", 21)
    return listOf<Name>(nameTemp, nameTem2, nameTem3, nameTem4, nameTem5)
}

fun main() {
    val names: List<Name> = readSSB()

    println("Names size = ${names.size}")
    println()
    println(names.take(1))
    println()

    names.take(2).forEach { println(it) }
    println()

    names.take(5).forEach { println(it) }
    println()

    // Sortere etter popularitet
    names.sortedBy { it. popularity }.take(5).forEach { println(it) }
    println()
    names.filter { it.name.contains("-")}.sortedBy { -it. popularity }.take(5).forEach { println(it) }
}
