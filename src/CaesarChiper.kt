fun main(args: Array<String>) {
    //the caesar chiper
    //Variabel intialization
    val s = "blackholesarewheregoddividedbyzero"
    println("Original message: $s")
    var message = ""
    var shift = 1

    //Lop Iterating over characters
    for (c in s){
        var i = c.toInt()
        i += shift
        if (i > 'z'.toInt()) {
            i -= 26
        }
        val char = i.toChar()
        message += char
    }

    println("Encrypted message: $message")
}