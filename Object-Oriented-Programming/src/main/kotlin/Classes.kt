class Car2(name: String, var model: String, var color: String, var doors: Int) {
    // To work on the arguments, we need to declare them here:
    var name = name.trim()

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}