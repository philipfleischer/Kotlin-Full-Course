//Top-level variables
val name1: String = "Fleischer"
var nema1: String = "Per"

var hilsen: String? = "Hello"
//Variables
fun main() {
    val name: String = "Philip"
    var nema: String = "Ole"
    nema = "Terje"
    println("$name og $nema")
    println("$name1 og $nema1")

    println(hilsen)
    hilsen = null
    println(hilsen)

    //if-else
    if (hilsen != null) {
        println(hilsen)
    } else {
        println("Hilsen er null")
        println("Hi")
    }

    //When
    when(hilsen) {
        null -> println("Hi")
        else -> println(hilsen)
    }
}