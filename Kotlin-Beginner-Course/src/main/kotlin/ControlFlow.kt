import kotlin.random.Random

fun main() {
    // Kotlin provides 'if' ans 'when' for conditional expressions
    // Use when, instead of if

    val d: Int
    val check: Boolean = true

    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d) // 1

    // if can be used as an expression
    val a = 1
    val b = 2
    println(if (a > b) a else b) // returns a value: 2

    // when
    // use 'when' when you have a conditional expression with multiple branches
    //To use when:
    // - Place the value to evaluate in ()
    // - Place branches within {}
    // - Use '->' in each branch that ckecks them
    val obj = "Hello"

    when (obj) {
        // checks wether obj equals to "1"
        "1" -> println("one")
        //Checks wether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }
    // Output: Greeting

    // An expression returns a value that can be used later in your code.
    val obje: String = "Hello"
    val result = when (obje) {
        "1" -> "One"
        "Hello" -> "Greetings"
        else -> "Unknown"
    }
    println(result) // Greetings

    // when without () subject
    val trafficLightState: String = "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction) // Stop

    // trafficLigstState as subject is more readable
    val trafficLState: String = "Yellow"

    val trafAction = when (trafficLState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafAction) // Slow down

    exercise4()
    exercise5()
}

fun exercise4() {
    val firstResult: Int = Random.nextInt(6)
    val secondResult: Int = Random.nextInt(6)
    println(if (firstResult == secondResult) "You Win:)" else "You Lose:(")
}

fun exercise5() {
    val button: String = "A"
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )


    // ----- Ranges--------
    // How to construct ranges for loops to iterate over.
    // Most common is '..', 1..4 i 1, 2, 3, 4.
    // To not include last element: 1..<4 -> 1,2,3
    // Reverse range: 4 downTo 1 -> 4,3,2,1
    // Range inc in steps: 1..5 step 2 -> 1, 3, 5
    // Same with Char ranges: 'a'..'d' -> 'a', 'b', 'c', 'd'


    // --------Loops--------
    // for and while loops, for to iterate over range, while condition true
    // for loop, range 5
    for (number in 1..5) {
        print(number)
    } // 12345
    println()

    // Collection iteration
    val cakes: List<String> = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }


    // while, used while true or:
    // do something, then check, do-while
    var cakesEaten: Int = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++ //Prints Eat a cake three times
    }
    println()

    // do-while
    var cakeesEaten: Int = 0
    var cakesBaked: Int = 0
    while (cakeesEaten < 3) {
        println("Eat a cake")
        cakeesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakeesEaten)

    exercise6()
    exercise7()
    exercise8()
}

fun exercise6() {
    // Counting pizza slices until 8 slices
    var pizzaSlices: Int = 0
    while (pizzaSlices < 8) {
        pizzaSlices++
        println("There is only $pizzaSlices slices of pizza :(")
    }
    println("There are $pizzaSlices slices of pixxa. Hooray! We have a whole pizza! :D")

    //For loop
    pizzaSlices = 0
    for (slice in 1..8) {
        pizzaSlices++
        println("There is only $pizzaSlices slices of pizza :(")
    }
    println("There are $pizzaSlices slices of pixxa. Hooray! We have a whole pizza! :D")

    // do-while loop
    pizzaSlices = 0
    do {
        pizzaSlices++
        println("There is only $pizzaSlices slices of pizza :(")
    } while (pizzaSlices < 8)
    println("There are $pizzaSlices slices of pixxa. Hooray! We have a whole pizza! :D")
}

fun exercise7() {
    for (i in 1..100) {
        println(
            when {
                i % 15 == 0 -> "fizzbuzz"
                i % 5 == 0 -> "buzz"
                i % 3 == 0 -> "fizz"
                else -> "$i"
            }
        )
    }
}

fun exercise8() {
    val words: List<String> = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        println(if (word.startsWith('l')) word else continue)
    }
}















