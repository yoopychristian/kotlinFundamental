//package main.kotlin.one.exercise.kotlin
//
//class Hero (name: String, hp: Int, damage:Int){
//    var name: String = name
//    var hp: Int = hp
//        private set
//    var damage: Int = damage
//
//    fun attack(enemy: Hero){
//        println("${this.name} attack ${enemy.name}")
//        enemy.receiveDamage(this)
//    }
//    fun receiveDamage(striker: Hero){
//        println("${this.name} receive damage from ${striker.name}")
//        this.hp = this.hp - striker.damage
//    }
//
//    fun getInfo(): String{
//        return "Hero(name='${this.name}', hp=${this.hp}, damage=${this.damage}"
//    }
//}