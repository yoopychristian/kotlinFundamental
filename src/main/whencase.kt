package main

fun main() {

    var x : Any = 13

    when(x) {
        in 3..7 -> println("it's in 3 until 7")
        9, 11-> println("it's 9 or 11")
        is Int -> println("it's a Integer")
        13 -> println("lucky number")
        else -> println(x)
    }
}