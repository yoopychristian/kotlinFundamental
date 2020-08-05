import main.kotlin.one.exercise.kotlin.Car

fun main() {
    val myCar = Car("Brown", "HRV", "Honda")
    println(myCar.getInfo())
    myCar.startEngine()
}
