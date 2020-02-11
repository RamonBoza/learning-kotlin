package Section03Exercises

fun main(args: Array<String> ) {
    val day = args[0].toInt();
    println("Good ${if(day<12)"morning" else "night"}, Kotlin");
}