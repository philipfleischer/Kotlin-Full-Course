fun main() {
    println("Hello World!")
    print(".    YOO")
    print(".    YOO")
    println()

    //Read-only variables with val
    //Mutable variables with var
    val popcorn = 5 // There are 5 boxes of popcorn
    val hotdog = 7 // There are 7 hotdogs
    var customers = 10 //There are currently 10 customers in queue

    //Some customers leave queue
    customers = 8
    customers -= 2
    println("Antall customers: $customers")
    println("One ordered a hot dog")
    println("Antall customers: ${customers - 1}")

    // Exercise 1
    val name = "Mary"
    val age = 20
    println("$name is $age years old")
}