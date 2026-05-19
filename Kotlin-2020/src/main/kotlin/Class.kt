fun main() {
    val person = Person(firstname="Philip", lastname="Fleischer")
    println(person.lastname)
    println(person.firstname)
    println("Person: ${person.firstname} ${person.lastname}")
    println()

    val person2 = Person()
    println("Person: ${person2.firstname} ${person2.lastname}")
    println()

    val person3 = Person()
    person3.firstname
    person3.lastname
    person3.nickName = "Fleisch"
    person3.nickName = "Shades"
    println(person3.nickName)
    (person2.nickName)
    println()

    person3.printInfo()
    person2.printInfo()
}