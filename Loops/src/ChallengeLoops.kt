fun main() {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber) {
        number++


        if (!isEvenNumber(number)) {
            continue
        }

        // Could use this intead
        if (number % 2 != 0) {
            continue
        }

        evenNumberCounter++
        println(number)
    }
    println("Now we are looking using the FOR loop")

    evenNumberCounter = 0
    for (i in 1..20) {
        if (i % 2 != 0) {
            continue
        }
        evenNumberCounter++
        println(i)
    }

    println("EVen numbers counter = $evenNumberCounter")
    println("Total number of even numbers found - using for loop - are: $evenNumberCounter")
}

fun isEvenNumber(number: Int): Boolean = if (number % 2 == 0) return true else return false