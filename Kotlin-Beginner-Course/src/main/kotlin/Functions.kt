import kotlin.math.PI
import kotlin.math.pow

fun hello() {
    return println("Hello, world!")
}

fun sum(x: Int, y: Int): Int {
    return x+y
}

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun printMessageDefaultValue(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum2(x: Int, y: Int): Int {
    return x + y
}

fun sum3(x: Int, y: Int): Int = x+y

fun userNames() {
    // A list of registered usernames
    val registeredUsernames: MutableList<String> = mutableListOf("john_doe", "jane_smith")

    // A list of registered emails
    val registeredEmails: MutableList<String> = mutableListOf("john@example.com", "jane@example.com")

    fun registerUser(username: String, email: String): String {
        // Early return if the username is already taken
        if (username in registeredUsernames) {
            return "Username already taken. Please choose diff username."
        }

        // Early return if email already registered
        if (email in registeredEmails) {
            return "Email registeered, use diff email."
        }

        // Proceed with the registration if the username and email are not taken
        registeredEmails.add(username)
        registeredEmails.add(email)
        return "User registered successfully: $username"
    }

    println(registerUser("john_doe", "newjohn@example.com"))
    // Username already ta...
    println(registerUser("new_user", "newuser@example.com"))
    // User registered su...
}

fun circleArea(radius: Double): Double = PI*radius.pow(2)

fun uppercaseString(text: String): String = text.uppercase()

//Written as Lambda
fun uppercaseLambda() {
    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("Hello"))
}

fun numberFilter() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter { it > 0 }
    val negatives = numbers.filter { it < 0 }

    println(positives) // [1, 3, 5]
    println(negatives) // [-2, -4, -6]
}

fun numberMap() {
    val numbers: List<Int> = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { it*2 }
    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)

    println(doubled) // [2, -4, 6, -8, 10, -12]
    println(tripled) // [3, -6, 9, -12, 15, -18]
}

fun lamUpperCase() {
    val upperCaseString: (String) -> String = { text -> text.uppercase() }
    println(upperCaseString("hello world"))
}

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value}
}

fun main() {
    hello() // Hello, world!
    println(sum(1,2)) // 3
    printMessageWithPrefix(prefix="Log", message="Hello") // [Log] Hello

    printMessageDefaultValue("Hello", "Log") // [Log] Hello
    printMessageDefaultValue("Hello") // [Log] Hello
    printMessageDefaultValue(prefix="Log", message="Hello") // [Log] Hello

    println(sum2(3,4)) // 7
    println(sum3(10,90)) // 100

    userNames()

    println(uppercaseString("hello")) // HELLO
    // can be wriotten as uppercase function

    println("Circle area radius 2 = ${circleArea(2.0)}")
    uppercaseLambda()
    numberFilter()
    numberMap()
    lamUpperCase()

    val timesInMinutes: List<Int> = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
    // Total time is 1680 secs
}