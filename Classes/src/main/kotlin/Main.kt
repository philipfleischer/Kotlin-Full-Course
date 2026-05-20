import java.io.File
import java.time.ZonedDateTime

fun main() {
    //Normal class
    val sessionStorage1 = SessionStorage(File("Hello.txt"))
    val sessionStorage2 = SessionStorage(File("world.txt"))

    println(sessionStorage2 == sessionStorage1) // false

    //Data class
    val p1 = Person(
        name = "Joh",
        birthDate = "25-03-2020",
        email = "test@gmail.com"
    )
    val p2 = Person(
        name = "Joh",
        birthDate = "25-03-2020",
        email = "test@gmail.com"
    )
    println(p1) // Person(name=Joh, birthDate=25-03-2020, email=test@gmail.com)
    println(p1 == p2) // true

    //Singleton
    DateUtil.format(ZonedDateTime.now())
    println(DateUtil)

    //Data Object
    DateUtil2.format(ZonedDateTime.now())
    println(DateUtil2)

    //Enum class
    val res = HttpStatus.OK
    println("$res  ${res.message} + ${res.name} + ${res.code}")
    println(res.toResponseString())
    //Iterate over enums
    HttpStatus.entries.forEach {
        println(it.name)
    }

    //sealed class
    val resA = NetworkResult.Success("Data A")
    val resB = NetworkResult.Success("Data B")

}

//Normal class, use when:
// 1. Constructor
// 2. Internal states, immutable states that can change
class SessionStorage(
    private val file: File
) {
    var counter = 0

    fun save(value: String) {
        // ..
    }
}

//Data class
// Use when we want to bundle data in a class
// We do not actually need more functionality to create a Person instance
// since we just want to represent a person with data and nothing more.
// More primitive and easy, simple.
// override functions like equals(), hashCode() and toString() functions
// so when we print a person we get: Person(name=Joh, birthDate=25-03-2020, email=test@gmail.com) instead
// of getting the memory address that a normal class would have given us
data class Person(
    val name: String,
    val birthDate: String,
    val email: String
) {
    // We can have functionality as well, for example
    // converting birthdate string to DateTime or semthing
}


//Singleton (Object Declaration)
object DateUtil {
    fun format(dateTime: ZonedDateTime): String {
        return ".."
    }
}

data object DateUtil2 {
    fun format(dateTime: ZonedDateTime): String {
        return ".."
    }
}

enum class HttpStatus(val code: Int, val message: String) {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found");

    fun toResponseString(): String {
        return "Error $code: $message"
    }
}

//Sealed classes
sealed class NetworkResult {
    data class Success(val data: String): NetworkResult()
    data class Error(val throwable: Throwable): NetworkResult()
    data object Empty: NetworkResult()
}

//Abstract class
abstract class Sensor {
    abstract val name: String

    abstract fun startListening(onNewValue: (Float) -> Unit)
}

class HeartRateSensor: Sensor() {
    override val name: String
        get() = "Heart Rate Tracker"

    override fun startListening(onNewValue: (Float) -> Unit) {
        println("Listening ")
    }
}