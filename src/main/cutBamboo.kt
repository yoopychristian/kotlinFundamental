package main

fun main() {
    var jmlBambu = arrayOf(0)
    print("^input jumlah bamboo : ")
    var bamboo = readLine()!!.toInt()
    for (i in 1..bamboo) {
        print(">Panjang bamboo ke-$i : ")
        var pjgBambu = readLine()!!.toInt()
        jmlBambu = jmlBambu + pjgBambu
    }

    print("^input jumlah cycle : ")
    var jmlCycle = readLine()!!.toInt()
    for (z in 0..jmlCycle){
        if("cycle ke-$z" == "cycle ke-0") {
            println(">initial")
        } else {
            println(">cycle ke $z : ")
        }
        for(x in jmlBambu.indices){
            for(y in 1..jmlBambu[x]!!) {
                print("-")
            }
            jmlBambu[x]= jmlBambu[x]?.minus(1)
            println()
        }
    }
}