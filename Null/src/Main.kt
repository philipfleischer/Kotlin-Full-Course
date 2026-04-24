fun main() {
    // We cannot write this:
    // val text: String = null
    // If we want to assign null to a variable, we need to add '?'
    val text: String? = null
    println("text: String? = null -> $text")

    val tex: String? = "Name"
    if (tex != null) {
        println("tex=Name, if tex != null -> tex.length = ${tex.length}")
    } else {
        println("The variable is null")
    }
    //This is equivalent to the if check above!
    // To check text.length, we need text?.length
    println("text?.length = ${text?.length}")

    var text2: String? = null
    text2 = "Some text"
    println("text2!!.length = ${text2!!.length}")

    // Since val text: String = null, text3 = "The variable is null."
    val text3: String = text ?: "The variable is null."
    println("text3.length = ${text3}")

    val text4: String = "This is a new textstring."
    val text5: String = text4 ?: "This is not a new textstring."
    println("This is text5 if text4 is null, but here it is text4 since text4 is not null: \n$text5")

    val t1 = "This variable is not null."
    var t2 = ""
    if (t1 != null) {
        t2 = t1
    } else {
        t2 = "This variable is null."
    }
    println(t2)
}













