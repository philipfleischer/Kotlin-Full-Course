fun main() {

    println("Printed 1->10")
    for (i in 1..10) {
        print(i)
    }
    println()

    println("Printed 1 until 10")
    for (i in 1 until 10) {
        print(i)
    }
    println()

    println("Printed 10 downTo 1")
    for (i in 10 downTo 1 ) {
        print(i)
    }
    println()

    println("Printed 10 downTo 1 and step 2")
    for (i in 10 downTo 1 step 2) {
        print(i)
    }
    println()

    println("Printed 1 .. 10 step 2")
    for (i in 1..10 step 2) {
        print(i)
    }
    println()

    for (i in 1..10) {
        print(i)
    }
}