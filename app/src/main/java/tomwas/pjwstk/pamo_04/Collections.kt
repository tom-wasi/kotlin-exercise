package tomwas.pjwstk.pamo_04

fun main()
{
    //1st exercise
    val green = listOf(14,21, 23)
    val red = listOf(17, 4)
    val totalCount = green.count() + red.count()
    println(totalCount)

    //2nd exercise
    val supported = setOf("gRPC", "HTTP", "HTTPS", "SFTP", "SMTP")
    val request = "SmTp"
    val isSupported = request.uppercase() in supported
    println("Is $request supported? $isSupported")
}
