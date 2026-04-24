fun main() {
    val max = getMax(a=34, b=12)
    println("The getMax(a=34, b=12) = $max")

    val maxListEl = getMaxList(liste=listOf<Int>(1, 2, 3, 4, 5))
    println("getMaxList(liste) = $maxListEl")
    val maxListEl2 = getMaxListOrNull(liste=listOf<Int>())
    println("getMaxList2(liste) = $maxListEl2")

    // -------- NEW SECTION --------
    val max2 = getMax(a=5.7, b=9.7)
    println("Print max double of 5.7/9.7 = $max2")
    val max3 = getMax(a=5, b=9, c=90)
    println("Print max of a=5, b=9, c=90 = $max3")
}

fun getMax(a: Int, b: Int): Int = if (a > b) a else b
fun getMax(a: Double, b: Double): Double = if (a > b) a else b
fun getMax(a: Int, b: Int, c: Int): Int {
    return if (a >= b && b >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}

fun getMaxList(liste: List<Int>): Int = liste.max() ?: 0

fun getMaxListOrNull(liste: List<Int>?): Int? = liste?.maxOrNull()






