package main.kotlin.one.exercise.kotlin

class Car (color: String, name: String, brand: String) {
    var color: String = color
    var name: String = name
    var brand: String = brand

    var fuel: Int = 1
    var engineStatus: String = "OFF"

    fun startEngine() {
        if(fuel<=0){
            println("Engine fail to start")
            return
        }
        engineStatus = "ON"
        println("Engine Starting...success")
    }


    fun getInfo(): String{
        return "The car is ${this.brand} ${this.name}, " +
                "with color ${this.color}, " +
                "engine status = $engineStatus, fuel=$fuel"
    }
}