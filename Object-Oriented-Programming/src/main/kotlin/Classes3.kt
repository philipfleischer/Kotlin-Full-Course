fun main() {
    val user = User(name="Philip", lastName="Fleischer", age=24)
    var friend = User(name="John", lastName="Smith", age=30)

    println("Name ${friend.name}")
}

class User(name: String, var lastName: String, var age: Int) {
    var name: String

    init {
        if (name.lowercase().startsWith("p")) {
            this.name = name
        }else {
            this.name = "Default User no name for startswith 'p'"
            println("The name does not start with 'p' or 'P'")
        }
    }
}