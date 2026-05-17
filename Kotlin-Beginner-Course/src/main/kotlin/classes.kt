import kotlin.random.Random
import kotlin.random.nextInt

class Contact(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"

    fun printId() {
        println(id)
    }
}

data class User(val name: String, val id: Int)

fun userTest() {
    // Print as string
    val user = User("Alex", 1)
    //Automatically uses toString() function so that output is easy to read
    println(user) // User(name=Alex, id=1)

    // Compare instances
    val user1 = User("Philip", 24)
    val secondUser = User("Oliver", 23)
    val thirdUser = User("Max", 2)
    val fourthUser = User("Philip", 24)

    //Compares user1 to second user:
    println("user1 == secondUser: ${user1 == secondUser}")
    // user1 == secondUser: false
    println("user1 == thirdUser: ${user1 == thirdUser}")
    // user1 == thirdUser: false
    println("user1 == fourthdUser: ${user1 == fourthUser}")
    // user1 == fourthUser: true

    //Copy instance
    println(user1.copy())
    println(user.copy("Max"))
    println(user.copy(id=3))
}

data class Employee(val name: String, var salary: Int)

fun exercise9() {
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean=true)
data class Name(val first: String, val last: String)
data class Address(val street: String, val city: City)
data class City(val name: String, val countryCode: String)
fun exercise10() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
    println(person)
}

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names: List<String> = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")
    fun generateEmployee() =
        Employee(names.random(),
            Random.nextInt(from = minSalary, until = maxSalary))
}
fun exercise11() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")

    //Prints the value of the property: email
    println(contact.email)
    //mary@gmail.com

    //Updates the value of the property: email
    contact.email = "jane@gmail.com"

    // Prints the new value of the property: email
    println(contact.email)
    //jane@gmail.com

    println("Their email address is: ${contact.email}")

    //Calls member function printId()
    contact.printId() // 1

    userTest()

    exercise9()
    exercise10()
    exercise11()
}