fun main() {
    val readText = "input/day1".readText()
    println(readText.lines()
        .map {
            val firstNum = it.first {
                it.isDigit()
            }

            val lastNum = it.last {
                it.isDigit()
            }

            println("first=${firstNum} and last=${lastNum}")

            "${firstNum}${lastNum}"
        }
        .sumOf { it.toInt() })
}

fun String.readText(): String {
    val contextClassLoader = Thread.currentThread().contextClassLoader
    return contextClassLoader.getResource(this)!!.readText()
}