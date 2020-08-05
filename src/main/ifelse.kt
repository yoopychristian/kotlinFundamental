package main

fun main() {
    print("Input waktu pengumpulan : ")
    val inputText = readLine()
    val submission = inputText!!.toInt()

    if (submission >= 8 && submission <= 17) {
        println("Berhasil Submit")
    } else {
        println("Tidak Berhasil")
    }
}