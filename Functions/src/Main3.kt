fun main() {
    sendMessage(name="Alexa", message="Hello")
    // -> Name = Alexa, message = Hello, Occupation = Default occupation is FIREFIGTHER
    sendMessage(name="Alexa")
    // -> Name = Alexa, message = Default text given, Occupation = Default occupation is FIREFIGTHER
    sendMessage()
    // -> Name = User defualt name, message = Default text given, Occupation = Default occupation is FIREFIGTHER
    sendMessage(message = "NOT GIVING NAME, only message - named parameter")
    // -> Name = User defualt name, message = NOT GIVING NAME, only message - named parameter, Occupation = Default occupation is FIREFIGTHER
    sendMessage(message="Message first", name="Name second")
    // -> Name = Name second, message = Message first, Occupation = Default occupation is FIREFIGTHER
    sendMessage(message="Message second", name="Message third", occupation="Poulice")
    // -> Name = Message third, message = Message second, Occupation = Poulice
}

fun sendMessage(name: String = "User defualt name", message: String = "Default text given", occupation: String = getOccupation()) {
    println("Name = $name, message = $message, Occupation = $occupation")
}

fun getOccupation(): String {
    return "Default occupation is FIREFIGTHER"
}