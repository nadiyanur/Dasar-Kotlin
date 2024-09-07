fun main(args: Array<String>) {
    val valInt: Int = 1
    val valSum: Long =  3L +valInt //konversi Implisit
    println("Konversi Variabel valInt secara Implisit : " +valSum)
    val valLong: Long = valInt.toLong()//konversi eksplisit
    println("Konversi Variabel valInt secara Eksplisit : "+valLong)
}
