interface PersonInfoProviderInterface {

    fun printInfo(person: Person) {
        person.printInfo()
    }
}

class BasicInfoProvider : PersonInfoProviderInterface {

}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
}

