fun main() {
    val readText = "input/day1".readText()

    val numberWords = mutableMapOf(
        Pair("one", 1),
        Pair("two", 2),
        Pair("three", 3),
        Pair("four", 4),
        Pair("five", 5),
        Pair("six", 6),
        Pair("seven", 7),
        Pair("eight", 8),
        Pair("nine", 9)
    )
    numberWords.values.toList().forEach {
        numberWords[it.toString()] = it
    }

    val reversedNumberWords = numberWords.keys.map {
        if (it.toIntOrNull() == null) it.reversed()
        else it
    }

    val sumOf = readText.lines()
        .map {
            val first = it.findAnyOf(numberWords.keys)!!
            val last = it.reversed().findAnyOf(reversedNumberWords)!!

            "${numberWords.get(first.second)}${numberWords.get(last.second.reversed())}"
        }.sumOf { it.toInt() }

    println(sumOf)
}