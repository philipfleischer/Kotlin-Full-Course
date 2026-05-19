
fun getGreeting(): String? {
    return "Hello Kotlin"
}

fun getGreetingLine(): String = "Hello Kotlin"

fun sayHello(): Unit {
    println(getGreeting())
}

fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello()
}