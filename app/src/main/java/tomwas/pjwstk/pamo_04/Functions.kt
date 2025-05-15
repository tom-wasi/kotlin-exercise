package tomwas.pjwstk.pamo_04

import kotlin.math.PI
import kotlin.random.Random

fun main()
{
    //1st exercise
    fun circleArea(radius: Int): Double
    {
        return radius * radius * PI
    }

    println(circleArea(Random.nextInt(5)))

    //2nd exercise
    fun circleAreaOneLiner(radius: Int): Double = radius * radius * PI

    println(circleAreaOneLiner(Random.nextInt(6)))

    //3rd exercise
    fun calculateIntervalInSeconds(hours: Int, minutes: Int, seconds: Int) {
        return println(((hours * 60) + minutes) * 60 + seconds)
    }

    calculateIntervalInSeconds(1, 2, 3)
    calculateIntervalInSeconds(5, 6, 7)
    calculateIntervalInSeconds(3, 2, 9)
    calculateIntervalInSeconds(7, 2, 3)
}