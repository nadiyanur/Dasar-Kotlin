fun main(args: Array<String>) {
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    var config = "Fullscreen shadows autosave"
    config = config.toLowerCase()
    println("will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("Will shadows be turned on?")
    ;println(config.contains("shadows"))
    println("Will sound be turned off")
    println(config.contains("nosound"))
    println("Would the player like to use autosave?")
    println(config.contains("autosave"))

    //replace()
    var strJava = "Java is the Best!"
    strJava = strJava.replace("Java", "Kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")

    //substring
    println("I Would not banish all of these Internets.".substring(2, 7))

    //comprateTo
    println("alpha".compareTo("bravo"))



}