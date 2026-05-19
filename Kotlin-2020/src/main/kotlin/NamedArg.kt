// vararg - variable number of arguments of type String:
fun sayHello6(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "React") = println("$greeting $name")

fun main() {
    greetPerson(greeting="hi", name="Philip")
    greetPerson(name="Philip", greeting="hi")
    greetPerson()
    println()

    val intThings: Array<String> = arrayOf("Kotlin", "Programming", "Comic Books")
    sayHello6("HI", *intThings)
    println()
    sayHello6(greeting="HI", itemsToGreet=intThings)
    println()
}