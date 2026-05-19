fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val interestingThings: Array<String> = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))
    println()

    //For iteration
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }
    println()

    interestingThings.forEach {
        println(it)
    }
    println()

    // If we want to name it something other than 'it'
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }
    println()

    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }
    println()
    println()

    // List
    val thingsList: List<String> = listOf("Java", "IN1010", "Drugs")
    println(thingsList[0])
    println()
    thingsList.forEach { thing ->
        println(thing)
    }

    val mutableList: MutableList<String> = mutableListOf("Python", "IN1000", "Season")
    mutableList.add("Blue perc")
    mutableList.forEach {
        println(it)
    }

    // Map
    val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key -> $value") }
    val mutMap: MutableMap<Int, String> = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mutMap.put(4, "d")
    mutMap.forEach { key, value ->  println("$key -> $value")}

    println()

    sayHello("hi", thingsList)
}