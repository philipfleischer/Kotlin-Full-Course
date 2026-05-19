
fun sayHello(itemToGreet: String) {
    val msg = "Hello $itemToGreet"
    println(msg)
}

fun sayHello2(itemToGreet: String = "Søren klype") = println("Hello $itemToGreet")

fun sayHello3(greeting: String = "Hello", itemToGreet: String = "nordmanm") = println("$greeting $itemToGreet")

fun main() {
    sayHello("YOOO")
    sayHello2("Orjas")
    sayHello2()
    sayHello3()
    sayHello3(itemToGreet = "MackTwist")
    sayHello3("Bonjour", "Franksmannen")
}