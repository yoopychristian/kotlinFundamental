package main.kotlin.one.exercise.kotlin

// Catatan:
// kalau primitive data type/ variable biasa itu passing value nya
// myFerrari -> myCar@8efb846 <- someoneCar = myFerrari
// myCar@8efb846 -> color
//               -> name
//               -> brand
// kalau object yang dipassing reference alamat memory nya

//fun main() {
//    val myYellowDaihatsuTerios = Car("Yellow", "Terios", "Daihatsu")
//    val myBlueToyotaRush = Car("Blue", "Rush", "Toyota")
//    myBlueToyotaRush.printInfo()
//    myYellowDaihatsuTerios.printInfo()


//    val myRedFerrariEnzo = Car()
//    myRedFerrariEnzo.color = "Red"
//    myRedFerrariEnzo.brand = "Ferrari"
//    myRedFerrariEnzo.name = "Enzo"

//    printInfo(myBlueToyotaRush)
//    printInfo(myYellowDaihatsuTerios)
//      printInfo(myRedFerrariEnzo)

//    val someoneCar = myRedFerrariEnzo
//
//    someoneCar.color = "Yellow"
//    printInfo(myRedFerrariEnzo)
//    printInfo(someoneCar)
//}


//private fun printInfo(myCar: Car) {
//    println(myCar)
//    println("The Car is a ${myCar.brand} ${myCar.name}, with color ${myCar.color}")
//}

//class Car (color: String, name: String, brand: String) {
//    var color: String = color
//    var name: String = name
//    var brand: String = brand
//
//    fun printInfo(){
//        println(this)
//        println("The Car is a ${this.brand} ${this.name}, with color ${this.color}")
//    }
//}
fun main() {
    val captainAmerica = Hero("Captain America", 100, 20)
    val ironMan = Hero("IronMan", 200, 15)

    captainAmerica.attack(ironMan)
    println(captainAmerica.getInfo())
    println(ironMan.getInfo())
    println(ironMan.hp)
}

class Hero (name: String, hp: Int, damage:Int){

    var name: String = name
    var hp: Int = hp
        private set
    var damage: Int = damage

    fun attack(enemy: Hero){
        println("${this.name} attack ${enemy.name}")
        enemy.receiveDamage(this)
    }
    fun receiveDamage(striker: Hero){
        println("${this.name} receive damage from ${striker.name}")
        this.hp = this.hp - striker.damage
    }

    fun getInfo(): String{
        return "Hero(name='${this.name}', hp=${this.hp}, damage=${this.damage}"
    }

}

