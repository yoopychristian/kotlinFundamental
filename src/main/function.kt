package main

//fun main() {
////    val bamboos = arrayOf(2,3,4,7,2,1)
////    cutBamboos(bamboos)
////    println(bamboos.joinToString())
//    var x=4
//    increase(x)
//    println("x=$x")
//}
//
//fun increase(a: Int) {
//    var number = a
//    number = number + 1
//    println("number = $number")
//}
//
//fun cutBamboos(bamboos: Array<Int>) {
//    for (i in bamboos.indices) {
//        bamboos[i] = bamboos[i] - 1
//    }
//}

//fun main() {
//    var x = 4
//    x = increase(x)
//    cetak(x)
//}
//
//fun increase(a: Int): Int {
//    return a+1
//}
//
//fun cetak(number: Int) {
//    print("cetak $number")
//}

fun main() {
    val tambah:(Int, Int) -> Int = {x: Int, y:Int -> x+y}
    var x = 4
    var y = 5
    val z = sum(x,y)
    val w = tambah(x,y)
    println(z)
    println(w)
}

fun sum(a: Int = 11, b: Int): Int {
    println("a=$a")
    println("b=$b")
    return a+b
}