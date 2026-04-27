fun main() {
    println()
    val car1 = Car2("Mercedes", "GLA 180", "Black", 4)

    car1.move()
    car1.stop()
    println()

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")
    car1.move()
    car1.stop()

    val car2 = Car2("Audi", "A3", "Black", 4)
    println()
    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")
    car2.move()
    car2.stop()
}