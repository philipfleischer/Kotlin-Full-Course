fun main() {

    // ---------------
    println("Printing 0->10 with While loop ")
    var number = 0
    while (number < 10) {
        print(number)
        number++
    }
    println()

    // ---------------
    println("Printing 0->10 with While loop POSTFIX INCREMENT")
    var num1 = 0
    while (num1 < 10) print(num1++)
    println()

    // ---------------
    println("Printing 0->10 with While loop PREFIX INCREMENT")
    var num2 = 0
    while (num2 < 10) print(++num2)
    println()


    // ---------------
    // do while loop
    println("Printing 0->10 with the Do-While loop POSTFIX INCREMENT")
    var num3 = 0
    do {
      print(num3)
        num3++
    } while (num3 < 10)
    println()

    // ---------------
    // Make sure that the incrementor is before, else an infinite loop here
    println("Printing 0->10 without 7")
    var num4 = 0
    while (num4 < 10) {
        num4++
        if (num4 == 7) {
            continue
        }
        print(num4)
    }
    println()

    // ---------------
    // Jump over numbers from 2->8
    println("Printing 0->10 num>2 && num<8")
    var num5 = 0
    while (num5 < 10) {
        num5++
        if (num5 > 2 && num5 < 8) {
            continue
        }
        print(num5)
    }
    println()

    // ---------------
    // Jump over numbers from 2->8 using the range function 2..8
    println("Printing 0->10 without 2..8")
    var num6 = 0
    while (num6 < 10) {
        num6++
        if (num6 in 3..7) {
            continue
        }
        print(num6)
    }
    println()

    // ---------------
    // Break on 7
    println("Print 0->10 and break on num==7")
    var num7 = 0
    while (num7 < 10) {
        if (num7 == 7) {
            break
        }
        print(num7)
        num7++
    }
    println()

    // ---------------
    println("ASTERISK PRINT******")
    var num8 = 0
    while (num8 < 5) {
        num8++
        println(num8)

        var i = 0
        while (i < 5) {
            i++
            println("***$i")
        }
    }
    println()

    // ---------------
    // OUTER@
    println("@OUTER@ -> PRINT******")
    var num9 = 0
    outer@ while (num9 < 3) {
        num9++
        println(num9) // We print 1

        var i = 0
        while (i < 3) {
            // Since i==0 on first iteration we
            // break outer loop, meaning the whole program here!
            if (i == 0) break@outer
            i++
            println("***$i")
        }
    }
}







