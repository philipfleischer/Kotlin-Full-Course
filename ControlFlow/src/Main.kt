fun main() {
    var alarm = 12

    when(alarm) {
        12 -> println("The time is $alarm")
        7 -> println("The time is $alarm")
        14 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }
    // Better:
    alarm = 14
    when(alarm) {
        12, 7, 14 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }
    // in range
    alarm = 8
    when(alarm) {
        in 1 .. 10 -> println("The number is in the range 1..10")
        12, 7, 14 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }
    // NOT in range
    alarm = 80
    when(alarm) {
        !in 1 .. 10 -> println("The number is NOT in the range 1..10")
        12, 7, 14 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }
    // Best practice for multiple expressions
    alarm = -1
    when(alarm) {
        in 1 .. 10 -> {
            println("The number is NOT in the range 1..10")
        }
        12, 7, 14 -> {
            println("The time is $alarm")
        }
        else -> {
            println("The time is $alarm")
        }
    }

    // putting the result in a variable
    alarm = 9
    val resultText = when (alarm) {
        in 1..10 -> {
            "The resulting number is in the range 1..10"
        }
        12, 7, 14 -> {
            println("The number is actually: $alarm")
            "The time is $alarm though!"
        }
        else -> {
            "Else branch, dont know time::)"
        }
    }
    println("resultText = $resultText")

    // less than in when()
    alarm = 7
    val texto = when {
        alarm <= 10 -> "The number is less than or equal to 10"
        alarm == 8 || alarm == 7 -> "The time is $alarm"
        else -> "The time is $alarm"
    }
    println(texto)
    // Here we can see that only one is run and then printed, before breaking
    alarm = 7
    val textoi = when {
        alarm == 8 || alarm == 7 -> "The time is $alarm"
        alarm <= 10 -> "The number is less than or equal to 10"
        else -> "The time is $alarm"
    }
    println(textoi)
}