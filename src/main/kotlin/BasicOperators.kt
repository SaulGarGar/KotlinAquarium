import java.util.Calendar

fun main(args: Array<String>) {
    kotlinGreeting(args[0])
}

private fun dayOfWeek(){
    println("What day is today?")
    val dayNumber = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var dayName = ""

    when(dayNumber){
        1 -> dayName = "Sunday"
        2 -> dayName = "Monday"
        3 -> dayName = "Tuesday"
        4 -> dayName = "Wednesday"
        5 -> dayName = "Thursday"
        6 -> dayName = "Friday"
        7 -> dayName = "Saturday"
    }

    println(dayName)
}

private fun kotlinGreeting(hour: String){
    if (hour.toInt() <12){
        println("Good morning Kotlin")
    }
    else {
        println("Good night Kotlin")
    }
}

