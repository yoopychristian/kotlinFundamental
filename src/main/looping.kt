package main

//fun main() {
//    val start = 1
//    val finish = 10
//    for (i in start..finish) {
//        if (i%2==0){
//            println(i)
//        }
//    }
//}
//
fun main() {
    for (i in 1..10 step 1) {
        for (j in 1..i step 1) {
            if (i==9 && j==5) break
            print(j)
        }
        println()
    }
}

//fun main(){
//    val start = 1
//    val finish = 10
//    for (i in start..finish step 1) {
//        if(i==5) break
//        println(i)
//    }
//}