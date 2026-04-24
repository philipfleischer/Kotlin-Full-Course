fun main() {
    var x = 5
    val y = 3

    val result = x + y
    println("Result = $result")

    println("x+y = ${x + y}")
    println("x-y = ${x - y}")
    println("x*y = ${x * y}")
    println("x/y = ${x / y}")
    println("x%y = ${x % y}\n")

    var res = x + y
    res = res + 2
    println("res x+y = $res")
    res += 4
    println("res x+y = $res\n")

    res = res - 2
    println("res x-y = $res")
    res -= 4
    println("res x-y = $res\n")

    res = res * 2
    println("res x*y = $res")
    res *= 4
    println("res x*y = $res\n")

    res = res / 2
    println("res x/y = $res")
    res /= 4
    println("res x/y = $res\n")

    res = res % 2
    println("res x%y = $res")
    res %= 4
    println("res x%y = $res\n")

    println("3 + 3 * 4 = ${3 + 3 * 4}") // = 15, since 4*3=12 then + 3

    x = 24
    println("x = $x")
    println("x++ = ${x++}") // Increases x after println() -> 24
    println("++x = ${++x}") //Increases x before println() -> 26
    println("x-- = ${x--}") // Decreases x after println() -> 26
    println("--x = ${--x}") // Decreases x before println() -> 24

    // -------------- NEW SECTION --------------
    val isActive: Boolean = true
    if (isActive) {
        println("Active = $isActive")
    } else {
        println("Inactive = ${!isActive}")
    }

    val num: Int = 100
    if (num >= 150) {
        println("num is larger than 150")
    } else if (num > 90) {
        println("num is larger than 90")
    } else {
        println("num is lesser than 90")
    }

    // -------------- NEW SECTION --------------
    val numba: Int = 100
    if (numba < 150) {
        println("numba is less than 150")
    } else if (numba < 90) {
        println("numba is less than 90")
    } else {
        println("numba is lesser than 90")
    }

    val numbar: Int = 150
    if (numbar != 150) {
        println("numbar is not 150")
    } else {
        println("numbar is 150")
    }

    val isPlaying: Boolean = true
    val score: Int = 80
    if (isPlaying && score == 100) {
        println("Next level")
    } else {
        println("Same level")
    }

    val num1: Short = 5
    val num2: Short = 4
    if (num1 > 0 || num2 > 0) {
        println("Cond true")
    } else {
        println("Cond false")
    }


    // -------------- NEW SECTION --------------

    val text = if (num1 > 0 || num2 > 0) {
        println("Cond true")
        "This is text1 cond1"
    } else {
        println("Cond false")
        "This is text2 cond2"
    }
    println(text)

    val texto = if (num1 < 0 || num2 < 0) "Tex1" else "Tex2"
    println(texto)

    val textNumber = if (num1 < 0 || num2 < 0) "Tex1" else 190
    println(textNumber)

    if (num1 > 0 || num2 > 0) println("Cond true") else println("Cond false")
}







