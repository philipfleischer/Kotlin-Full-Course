fun main() {
    val sum1 = sumDumb(a=5, b=6, c=7, d=10)
    println("Sum of sum(a=5, b=6, c=7, d=10) = $sum1")

    val sum2 = sumMultipleIntegers(1, 2, 3,4, 5, 6,6 ,23, 1, 31, 412, )
    println("Sum multiple passed arguments = $sum2")

    val sum3 = printSumMultipleForEach(1, 2, 3,4, 5, 6,6 ,23, 1, 31, 412, )
    println("print many args with numbers.forEach{ println(it) } = $sum3")

    val sum4 = sumMultipleForEach(1, 2, 3,4, 5, 6,6 ,23, 1, 31, 412, )
    println("SUM many args with numbers.forEach{ println(it) } = $sum4")
}

// This function is kind of dumb, since we cannot pass as many arguments as we want.
fun sumDumb(a: Int, b: Int, c: Int, d: Int): Int {
    return a+b+c+d
}

fun sumMultipleIntegers(vararg numbers: Int): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }
    return result
}

fun printSumMultipleForEach(vararg numbers: Int) {
    numbers.forEach { println(it)}
}

fun sumMultipleForEach(vararg numbers: Int): Int {
    var result = 0
    numbers.forEach { result += it }
    return result
}