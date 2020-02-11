package Section04Exercises

class SimpleSpice {
    var name:String = "curry"
    var spiciness:String = "mild"

    val heat: Int
         get() = 5
}

fun main(args:Array<String> ) {
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")
}