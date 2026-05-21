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
}