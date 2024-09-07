fun main(args: Array<String>) {
    //split( dan JoinToString()
    //Morse code decoder
    //the string which we want to decode
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

    var message = ""

    //array definitions
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
    val characters = s.split(" ")

    for (morseChar in characters){
        val index = morseChars.indexOf(morseChar)
        if (index != -1){
            message += alphabetChars[index]
        }
    }

    println("The decode message: $message")
}