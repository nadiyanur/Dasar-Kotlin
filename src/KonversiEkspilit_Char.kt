fun main(args: Array<String>) {
    var c : Char
    var i: Int

    c = 'a'
    i = c.toInt()
    println("The caracter $c was converted to its ASCII value of $i")

    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")
}