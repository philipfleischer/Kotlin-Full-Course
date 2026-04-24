fun main() {
    sayHello(name="Philip", age=24)

    val hasInternetConn = false
    if (hasInternetConn) getData(data="Some data") else showMessage()
}

fun sayHello(name: String, age: Int) {
    // This is not allowed, since 'name' and 'age' are 'val name' and 'val age', immutable
    // age = 30
    var number = age
    number += 20
    println("Hello, $name! Your age is $age")
    println("In 20 years you will be $number")
}

fun getData(data: String) = println("Your data is: $data")

fun showMessage() = println("There is no internet connection")