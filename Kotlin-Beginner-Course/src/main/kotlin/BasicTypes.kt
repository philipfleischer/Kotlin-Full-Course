fun main() {
    // Type inference
    var customers = 10

    // Some customers leave the queue
    customers = 8

    customers = customers + 3
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3

    println("Customers: $customers")

    // Type hinting
    // Variable declared without initialization
    val d: Int
    // variable initialized:
    d = 3

    // Variable explicitly typed and initialized
    val e: String = "hello World"

    // Variables can be read because they have been initialized
    println("d: $d") //3
    println("e: $e") //hello World

    // Exercise 2
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d2: Long = 100_000_000_000_000
    val e2: Boolean = false
    val f: Char = '\n'

}