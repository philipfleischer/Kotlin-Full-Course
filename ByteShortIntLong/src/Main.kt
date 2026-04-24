fun main() {

    // ------------------ INTEGER ------------------
    var number: Int = 24

    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE

    println("Integer Max value is: $maxIntegerValue")
    println("Integer Min value is: $minIntegerValue")

    number = 2147483647

    // ------------------ BYTE ------------------
    val maxByteValue: Byte = Byte.MAX_VALUE
    val minByteValue: Byte = Byte.MIN_VALUE

    println("Byte Max value is: $maxByteValue")
    println("Byte Min value is: $minByteValue")

    // ------------------ SHORT ------------------
    val maxShortValue: Short = Short.MAX_VALUE
    val minShortValue: Short = Short.MIN_VALUE

    println("Short Max value is: $maxShortValue")
    println("Short Min value is: $minShortValue")

    // ------------------ LONG ------------------
    val maxLongValue: Long = Long.MAX_VALUE
    val minLongValue: Long = Long.MIN_VALUE

    println("Long Max value is: $maxLongValue")
    println("Long Min value is: $minLongValue")

    // ------------------ FLOAT ------------------
    val myNumber: Float = 2.5F
    println("float myNumber = $myNumber")

    // ------------------ DOUBLE ------------------
    // inferred as double and not Float
    val mySecondNumber = 2.5
    println("double mySecondNumber = ${mySecondNumber}")
    val myThirdNumber: Double = 2.5
    println("doubel myThirdNumber = ${myThirdNumber}")

    //--------------- CHAR ---------------
    val myChar: Char = 'P'
    println("myChar: $myChar")

    //--------------- BOOLEAN ---------------
    val myBoolean: Boolean = true
    println("myBoolean: $myBoolean")
}

















