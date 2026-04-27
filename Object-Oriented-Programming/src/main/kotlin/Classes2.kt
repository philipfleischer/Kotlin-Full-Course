fun main() {
    println()
    val car1 = Car()

    car1.move()
    car1.stop()
    println()

    car1.name = "Mercedes"
    car1.model = "GLA 180"
    car1.color = "Black"
    car1.doors = 4

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")
    car1.move()
    car1.stop()

    val car2 = Car()
    car2.name = "Audi"
    car2.model = "A3"
    car2.color = "Black"
    car2.doors = 4
    println()
    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")
    car2.move()
    car2.stop()
}

class Car {
    var name: String = ""
    var model: String = ""
    var color: String = ""
    var doors: Int = 0

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}