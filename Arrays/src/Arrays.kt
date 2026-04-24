fun main() {
    val names: Array<String> = arrayOf("John", "Peter", "Jan")
    val names2 = arrayOf("John", "Peter", "Jan")
    println("First element: ${names[0]}")
    println("Second element: ${names[1]}")
    println("Third element: ${names[2]}")

    names[0] = "Philip"
    println("First element: ${names[0]}")
    println("The size of the array is: ${names.size}")

    val numbers: Array<Int> = arrayOf(1, 2, 3, 4)
    val strInts: Array<Any> = arrayOf(1, 2, 3, 4, 5, "Hello", "wolrds", 'p')
    println(strInts[1])
    println(strInts[7])

    for (i in numbers) {
        print(i)
    }
    println()
    for (i in strInts) {
        print(i)
    }
    println()

    // is-keyword
    for (i in strInts) {
        if (i is Int) {
            print(i)
        }
    }
    println()
    for (i in strInts) {
        if (i is Char) {
            print(i)
        }
    }
    println()
    for (i in strInts) {
        if (i is String) {
            print("$i ")
        }
    }
    println()
}