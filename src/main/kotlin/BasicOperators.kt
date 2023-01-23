import java.util.Calendar

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
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