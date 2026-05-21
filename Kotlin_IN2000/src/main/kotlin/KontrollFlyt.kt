//Kontrollflyt / Control Flow

fun maxOf(a: Int, b: Int): Int = if(a > b) a else b

//when
fun numToWord(x: Int) {
    println()
    when(x) {
        0 -> println("zero")
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        5 -> println("five")
        6 -> println("six")
        7 -> println("seven")
        8 -> println("eight")
        else -> {
            print("DUNNO")
        }
    }
    println()
}

//for-loop
fun forTest() {
    val items: List<String> = listOf("Alpacas", "are", "cool")

    items.forEach { print("$it ") }
    println()
}

fun forTest2() {
    val items: List<String> = listOf("Halle", "måne", "Kjøre", "deg")

    for((index, value) in items.withIndex()) {
        println("$index : $value")
    }
    println()
}

fun forTest3() {
    val items: List<String> = listOf("Camel", "Back", "Hog", "Roder")

    items.forEachIndexed { index, string ->
        println("$index <--:--> $string")
    }
    println()
}

fun fT() {
    for (i in 1..4) {
        print("$i ")
    }
    println()
}

fun fT2() {
    for (i in 6 downTo 0 step 2) {
        print("$i ")
    }
    println()
}

//While
fun whilT() {
    val items: List<String> = listOf("IN2000", "is", "cool")
    var i = 0

    while (i < items.size) {
        println("item at $i is ${items[i]}")
        i++
    }

}

fun main() {
    println(maxOf(3, 4))
    numToWord(5)
    numToWord(90)
    forTest()
    forTest2()
    forTest3()
    fT()
    fT2()
    whilT()
}