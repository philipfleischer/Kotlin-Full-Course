// Finn summen av alle partall i listen

fun sumEven(liste: List<Int>): Int = liste.filter { it % 2 == 0 }.sumOf { it }

fun main() {
    val numbers: List<Int> = listOf(1,2,3,4,5,6,7,8,9)
    val result: Int = sumEven(numbers)
    println("Sum og even numbers: $result")
}