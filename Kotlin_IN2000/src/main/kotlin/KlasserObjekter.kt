// Klasser og objekter

//Enkel klasse:
class Person {
    val age = 10
}
class Person2(val age: Int = 10)

data class Person3(val age: Int, val name: String)


//Arv - Inheritance
open class Car(val plateNumber: String)

class Elcar(plateNumber: String, val batteryCapacity: Int) : Car(plateNumber)

//ENUM klasser
enum class Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

fun main() {
    val person = Person()
    println(person.age)
    val person2 = Person2(20)
    println(person2.age)
    println()
    println(person)
    val person4 = Person3(39, "Ole")
    println(person4)
    println()
    val elCar = Elcar("IN2000", 10000)
    println(elCar.plateNumber)
    println(elCar.batteryCapacity)

    //typer
    val items1: List<String> = listOf("In2090", "IN2000", "IN2010")
    println("items1: List<String>:")
    items1.forEach { print("$it ") }

    val items2: List<Int> = listOf(200, 2010, 2019)
    println("\nitems2: List<Int>:")
    items2.forEach { print("$it ") }

    val items3: List<Any> = listOf("IN1000", 2010, 'A', true)
    println("\nitems3: List<Any>:")
    items3.forEach { print("$it ") }

    //Enum
    val today = Day.THURSDAY
    println(if (today == Day.SATURDAY || today == Day.SUNDAY) "Weekend!" else "weekday...")

}