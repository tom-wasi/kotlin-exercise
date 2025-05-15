package tomwas.pjwstk.pamo_04

import com.github.javafaker.Faker

fun main()
{
    val faker = Faker()
    //1st exercise
    var pizzaSlices = 0
    pizzaSlices++
    do{
        println("There is $pizzaSlices of pizzunia slice >:(")
        pizzaSlices++
    } while (pizzaSlices < 8)
    println("There is a whole pizza now")

    //2nd exercise
    for (num in 1..100)
    {
        println(
            when {
                num %15 == 0 -> "fizzbuzz"
                num % 3 == 0 -> "fizz"
                num % 5 == 0 -> "buzz"
                else -> num
            }
        )
    }

    //3rd exercise
    val words = listOf(faker.twinPeaks().location(), faker.twinPeaks().character(), faker.yoda().quote())
    for (word in words)
        if(!word.startsWith("i") || word.startsWith("e") || word.startsWith("s") )
            println(word)
}