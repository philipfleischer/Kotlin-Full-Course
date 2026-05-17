fun nullIntro() {
    // Null Safety
    // neverNull has String type
    var neverNull: String = "This cannot be null"

    //Throws a compiler error
    //neverNull = null

    //nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This is OK
    nullable = null

    // By default, null values are not accepted
    var inferredNonNull = "The compiler assumes non-nullable"

    //Throws a compiler error
    //inferredNonNull = null

    // notNull does not accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    println(strLength(neverNull)) // 19
    //println(strLength(nullable)) // compiler error
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

// Safe calls
fun lengthString(maybeString: String?): Int? = maybeString?.length

data class Employee2(val name: String, var salary: Int)

fun employeeById(id: Int) = when(id) {
    1 -> Employee2("Mary", 20)
    2 -> null
    3 -> Employee2("John", 21)
    4 -> Employee2("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

fun main() {
    nullIntro()
    var nullString: String? = null
    println(describeString(nullString)) // Empty or null string
    println(lengthString(nullString)) // null
    println(nullString?.uppercase()) // null

    // Use elvis operator '?:' if null
    println(nullString?.length ?: "It was null, so printing this")
    println((1..5).sumOf { id -> salaryById(id) })
}