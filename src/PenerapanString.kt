fun main(args: Array<String>) {
    var s = "A Programmer gets stuck in the shower because the instruction on the shampoo were: Lather, wash, and Repeat."
    println(s)
    s = s.toLowerCase()

    var vowelCount = 0
    var consonanCount = 0

    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    for (c in s){
        if (vowels.contains(c)) {
            vowelCount++
        }else if (consonants.contains(c))
            consonanCount++
        }

    println("Vowels: $vowelCount")
    println("Consonants: $consonanCount")
    println("Other Characters: ${s.length - (vowelCount + consonanCount)}")
    }


