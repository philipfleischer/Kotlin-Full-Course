fun main() {
    // To create a read-only list, use listOf()
    // To create a mutable list, use mutableListOf()

    //Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    println(readOnlyShapes[0])
    // [triangle, square, circle]

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    for (shape in readOnlyShapes) {
        println(shape)
    }
    shapes.add("rectangel")
    println(shapes)

    // To prevent unwanted modifications, create read-only view of mutable list
    val shapesLocked: List<String> = shapes
    println("Third element in shapes is ${shapes[2]}")
    println("The first element with .first() = ${shapes.first()}")
    println("The last element with .last() = ${shapes.last()}")

    // Get number of items with .count()
    println("This list has ${readOnlyShapes.count()} items. (readOnlyShapes.count())")

    //Check if item in list, with 'in' operator
    println("circle" in readOnlyShapes) //true

    //To add or remove items from mutable list, .add() and .remove()
    //add "pentagon" to shapes list
    shapes.add("pentagon")
    println(shapes)
    //[triangle, square, circle, rectangel, pentagon]

    //remove the first "pentagon" from list
    shapes.remove("pentagon")
    println(shapes)
    //[triangle, square, circle, rectangel]


    // Set, unordered unique elements
    // read-only set, use setOf()
    // mutable set, mutableSetOf()
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    //Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)
    // [apple, banana, cherry]
    println(fruit)
    // [apple, banana, cherry]

    // number of elements, .count()
    println("This set has ${readOnlyFruit.count()} items. (readOnlyFruit.count())")

    // item 'in' set
    println("banana" in readOnlyFruit) // true

    // To add or remove from mutableSetOf -> .add() and .remove()
    fruit.add("dragonfruit")
    println(fruit) // [apple, banana, cherry, dragonfruit]
    fruit.remove("dragonfruit")
    println(fruit) // [apple, banana, cherry]
    val fruit2: MutableSet<String> = mutableSetOf("k2", "32", "e")
    val fruitser: MutableSet<Int> = mutableSetOf(1, 2, 34)
    for (item in fruit2){
        println(item)
    }
    for (num in fruitser){
        println(num)
    }


    // Map - dictionary
    //key-value pairs, refernce key for value, unique keys, duplicate values
    // read-only map, mapOf()
    // mutable map, mutableMapOf()
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu) // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu) // {apple=100, kiwi=190, orange=100}
    // lock it:
    val juiceMenyLocked: Map<String, Int> = juiceMenu

    // To access value in map, use index operator [] with its key:
    //Read only map
    val readJuiceMenu: Map<String, Int> = mapOf("apple" to 220, "kiwi" to 190, "orange" to 990)
    println("The value of apple juice is: ${readJuiceMenu["apple"]}. (readJuiceMenu['apple']")
    // The value of apple juice is: 220. (readJuiceMenu['apple']
    // if apple not in map we get: string: null. (...)

    // Use indexed access operator [] to add items to mutable map
    val juicerMenu: MutableMap<String, Int> = mutableMapOf("apple" to 4430, "kiwi" to 2345, "orange" to 111)
    juicerMenu["coconut"] = 150 // Add key coconut with value 150 to the map
    println(juicerMenu) // {apple=4430, kiwi=2345, orange=111, coconut=150}

    // To remove items from a mutable map, use .remove()
    val jusMenu: MutableMap<String, Int> = mutableMapOf("apple" to 4430, "kiwi" to 2345, "orange" to 111, "coconut" to 14)
    jusMenu.remove("orange") // Remove key orange from map
    println(jusMenu) //{apple=4430, kiwi=2345, coconut=14}

    // To get number of items, use .count()
    val readerJuiceMenu: Map<String, Int> = mapOf("apple" to 4430, "kiwi" to 2345, "orange" to 111, "coconut" to 14)
    println(readerJuiceMenu)
    println("This map has ${readerJuiceMenu.count()} key-value pairs.")
    // This map has 4 key-value pairs.

    // To check if specific key in map, use .containsKey()
    val readsOnlyJuiceMenu: Map<String, Int> = mapOf("apple" to 4430, "kiwi" to 2345, "orange" to 111, "coconut" to 14)
    println(readsOnlyJuiceMenu.containsKey("kiwi")) // true

    // To obtain collection of keys or values of a map, use .keys and .values
    val rOnlyJusMenu: Map<String, Int> = mapOf("apple" to 4430, "kiwi" to 2345, "orange" to 111, "coconut" to 14)
    println(rOnlyJusMenu.keys) // [apple, kiwi, orange, coconut]
    println(rOnlyJusMenu.values) // [4430, 2345, 111, 14]

    // check that key or value in map, use 'in' operator
    val reJuiceMenu: Map<String, Int> = mapOf("apple" to 4430, "kiwi" to 2345, "orange" to 111, "coconut" to 14)
    println("orange" in reJuiceMenu.keys) // true
    // better:
    println("orange" in reJuiceMenu) // true
    //value
    println(200 in reJuiceMenu.values) // false
    println(4430 in reJuiceMenu.values) // true


    exercise1()
    exercise2()
    exercise3()
}

fun exercise1() {
    val greenNumbers: List<Int> = listOf(1, 4, 23)
    val redNumbers: List<Int> = listOf(17, 2)
    val g_len: Int = greenNumbers.count()
    val r_len: Int = redNumbers.count()
    println("Length of green: $g_len and length of red: $r_len")
    println("Combined length = ${g_len + r_len}")
}

fun exercise2() {
    val SUPPORTED: Set<String> = setOf("HTTP", "HTTPS", "FTP")
    val requested: String = "smtp"
    val isSupported: Boolean = requested.uppercase() in SUPPORTED
    println("Support for $requested: is $isSupported")
}

fun exercise3() {
    val number2word: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n: Int = 2
    println("$n is spelled as '${number2word[n]}'")

}