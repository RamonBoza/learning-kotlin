import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    feedTheFish()
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensorReading()): Boolean {

    val isTooHot = temperature > 30
    val isTooDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot -> true
        isTooDirty -> true
        isSunday -> true
        else -> false
    }
}

fun isTooHot(temperature:Int ) = temperature > 30

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day, temperature = 20)

    if(shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun fishFood(day: String): Any {

    return when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "something"
        else -> "fasting"
    }
}

fun randomDay() : String {
    val week = listOf ( "Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}