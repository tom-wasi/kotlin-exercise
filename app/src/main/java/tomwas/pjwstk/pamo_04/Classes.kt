package tomwas.pjwstk.pamo_04

import java.util.Currency
import com.github.javafaker.Faker
import kotlin.random.Random

data class Employee(val name: String, var salary: Int, val currency: String)
data class Person(val name: Name, val address: Address, var ownsAPet: Boolean = true)
data class Name(val first: String, val last: String)
data class Address(val street: String, val city: City)
data class City(val name: String, val countryCode: String)
class RandomEmployeeGenerator(private var minSalary: Int, private var maxSalary: Int)
{
    private var faker = Faker()
    fun generateEmployee() =
        Employee(faker.name().fullName(), Random.nextInt(minSalary, maxSalary), faker.currency().code())
}
fun main()
{
    //1st exercise
    val employee = Employee("Tomasz", 999999999, "USD")
    println(employee)

    employee.salary -= 10000
    println(employee)

    //2nd exercise
    val person = Person(Name("Tomasz", "Wasielewski"), Address("Kolodzieja", City("Gdansk", "PL")))
    println(person)

    person.ownsAPet = false
    println(person)

    //3rd exercise
    val empGen = RandomEmployeeGenerator(1000, 200000)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())

}