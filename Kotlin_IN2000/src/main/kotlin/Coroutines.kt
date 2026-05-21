import kotlinx.coroutines.*

fun main1() = runBlocking {
    coroutineScope {    // Creates a new coroutine scope
        launch {        // Launch a new coroutine and continue
            delay(1000) // non-blocking delay fo 1s
            print(" World!")     // Print after delay
        }
        print("Hello") // main coroutine continues while a previous one is delayed
    }
    println()
}

fun main2() = runBlocking {
    coroutineScope {
        val tekst = async {
            delay(1000)
            " World!"
        }
        print("Hello" + tekst.await())
    }
    println()
}

fun main() {
    main1()

    main2()
}