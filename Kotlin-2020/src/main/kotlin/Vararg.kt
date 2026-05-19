// vararg - variable number of arguments of type String:
fun sayHello5(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val interestingThings: List<String> = listOf("Kotlin", "Programming", "Comic Books")
    sayHello5("Hi", "Kotlin", "Python", "Java")

    // spread operator, to pass ArrayOf
    val arrThings: Array<String> = arrayOf("Kotlin", "Programming", "Comic Books")
    sayHello5("Hi", *arrThings)
}