package tomwas.pjwstk.pamo_04

import kotlin.random.Random

fun main()
{
        //1st exercise
        val firstRoll = Random.nextInt(6)
        val secondRoll = Random.nextInt(6)

        if(firstRoll == secondRoll)
        {
            println("You win :)")
        } else println("You lose :(")

        //2nd exercise
        val options = arrayOf("A", "B", "X", "Y", "Other")
        val button = options[Random.nextInt(0,5)]
        println(
                when (button) {

                        "A" -> "Yes"

                        "B" -> "No"

                        "X" -> "Menu"

                        "Y" -> "Nothing"

                        else -> "There is no such button"
                }
        )
}