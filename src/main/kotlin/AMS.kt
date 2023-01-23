import java.util.Random

fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String{
    return when (day){
        "Monday" -> "flakes"
        "Tuesday" -> "flakes"
        "Sunday" -> "flakes"
        "Thursday" -> "flakes"
        "Friday" -> "flakes"
        else -> "fasting"
    }
}