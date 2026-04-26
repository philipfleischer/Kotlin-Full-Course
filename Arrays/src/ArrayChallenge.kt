fun main() {
    val max = findMax(arrayOf(4, 6, 7, 4, 3, 6))
    val min = findMin(arrayOf(4, 7, 9, 20, 7, 100))
    println("Max value = $max")
    println("Min value = $min")

    val mAX = findMinAndMax(numbers=arrayOf(20, 40, 50, 60, 100), searchMax=true)
    println("The max value is = $mAX")
    val mIN = findMinAndMax(numbers=arrayOf(20, 40, 50, 60, 100), searchMax=false)
    println("The max value is = $mIN")
}

fun findMinAndMax(numbers: Array<Int>, searchMax: Boolean): Int {
    var max = numbers[0]
    var min = max
    if (searchMax) {
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }
        return max
    } else {
        for (number in numbers) {
            if (number < min) {
                min = number
            }
        }
        return min
    }
}

fun findMax(numbers: Array<Int>): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun findMin(numbers: Array<Int>): Int {
    var min = numbers[0]
    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }
    return min
}