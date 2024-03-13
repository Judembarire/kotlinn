import java.time.LocalDate
import java.time.DayOfWeek
import java.time.Month
fun main(){
    val present = LocalDate.now()
    val day =present.dayOfWeek
    val month =present.month
    println("it is $day in $month")
}