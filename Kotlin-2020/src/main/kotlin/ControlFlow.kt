val name = "Nate"
var greeting: String? = null

fun main() {
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name)
    println()

    greeting = null
    val greetingToPrint2 = when(greeting) {
        null -> "Gday mate"
        else -> greeting
    }
    println(greetingToPrint2)
    println(name)
    println()
}