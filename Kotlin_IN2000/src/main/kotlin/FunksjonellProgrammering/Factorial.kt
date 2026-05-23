package FunksjonellProgrammering

fun factorial1(n: Int): Int {
    var i = 1
    var res = 1

    while (i < n) {
        i += 1
        res *= i
    }
    return res
}

fun factorial2(n: Int): Int {
    var res = 1

    for (i in 1..n) {
        res *= i
    }
    return res
}

fun factorial3(n: Int): Int {
    if (n <= 0) {
        return 1
    }
    return n * factorial3(n - 1)
}

fun factorial4(n: Int): Int = if (n <= 0) 1 else n * factorial4(n - 1)

fun factorial5(n: Int): Int =
    when (n) {
        0 -> 1
        else -> n * factorial5(n - 1)
    }

fun factorial6(n: Int): Int =  (1..n).fold(1) { acc, x -> acc * x }

fun factorial7(n: Int): Int = (1..n).fold(1, Int::times)

fun main() {
    println("Fac1 -> ${factorial1(4)}")
    println("Fac2 -> ${factorial2(4)}")
    println("Fac3 -> ${factorial3(4)}")
    println("Fac4 -> ${factorial4(4)}")
    println("Fac5 -> ${factorial5(4)}")
    println("Fac6 -> ${factorial6(4)}")
    println("Fac7 -> ${factorial7(4)}")

}
