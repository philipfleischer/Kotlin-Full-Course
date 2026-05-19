class Person(val firstname: String = "Ola", val lastname: String = "Nordmann") {
    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickname is $value")
        }
        get() {
            println("The returned value is $field")
            return field
        }

    fun printInfo() {
        val nickNameToPrint = nickName ?: "No nickname"
        println("$firstname ($nickNameToPrint) $lastname")
    }
}