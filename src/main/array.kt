package main

//fun main() {
//    var numbers: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
//
//    for (i in numbers) {
//        if (i % 3 == 0) {
//            println(i*2)
//        } else {
//            println(i)
//        }
//    }
//}

//fun main() {
//    var numbers: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
//    //numbers = arrayOf(4,5,2,1,5,0,2,1)
//    numbers[5] = 99
//    numbers = numbers.plus(100)
//    println(numbers.joinToString())
//}

//fun main() {
//    var numbers:Array<Int> = arrayOf(2,5,1,6,1,8,2,9,3)
////    for (i in numbers.indices) {
////        println(i)
////    }
//    numbers.forEach { x -> println(x+1) }
//    println(numbers.joinToString(" "))
//}

fun main() {
    var numbers:Array<Int> = arrayOf(2,5,1,6,1,8,2,9,3)
    var numbers2:Array<Int> = arrayOf(99,33,22,11,44,66)

    var allofthem = numbers+numbers2
    println(allofthem.joinToString())
}