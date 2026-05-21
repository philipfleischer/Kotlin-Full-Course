// null safety
// "I call it my billion-dollar mistake. It was the invention of the null reference in 1965."
// Tony Hoare
// Hva er null? - En peker til "ingenting"
// Man får NullPointerException, Kotlin har innebygd Null Safety
// Nullable types, når vi trenger null

fun nullableTypes() {
    val x1: String = ""
    val y1: String? = null
    val x2: Int = 0
    val y2: Int? = null
    val x3: Double = 2.0
    val y3: Double? = null
    val x4: Float = 1f
    val y4: Float? = null
    val harKatt1: Boolean = true
    val harKatt2: Boolean? = false ?: null

    //Assert non null -> !!
    val name: String? = "IN2000"
    val length: Int = name!!.length
    println(length)

    //Safe call operator er bedre
    val name2: String? = null
    val length2: Int? = name2?.length
    println(length2)

    // Null safety - Elvis operator - ?:
    // Hvis verdi til venstre er null, så brukes høyre verdi
    // Tryggeste alternativ.
    val name3: String? = "Philip" //Dette varierer så klart, så kan være null
    val default = "IN2000"
    val finalName = name3 ?: default
    println(finalName)

    // Det enkleste er å bare sjekke og så gjøre:
    val x9: String? = null
    if (x9 != null) {
        println(x9.length)
    }

}

fun main() {
    nullableTypes()
}