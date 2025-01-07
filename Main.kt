fun main() {
    // task1 Map names
    val originalMap = mapOf(
        1 to "Аня",
        2 to "Борис",
        5 to "Гриша",
        4 to "Даша",
        6 to "Елена",
        7 to "Галина"
    )

    // key < 5
    val filteredByKey = originalMap.filter { (key, _) -> key < 5 }
    println("Элементы с ключом менее 5: $filteredByKey")

    // task2 А
    val filteredByValueEndingWithA = originalMap.filter { (_, value) -> value.endsWith("а") }
    println("Элементы, значения которых оканчиваются на 'а': $filteredByValueEndingWithA")

    // task3 Г
    val filteredByValueStartingWithG = originalMap.filter { (_, value) -> value.startsWith("Г") }
    println("Элементы, значения которых начинаются на 'Г': $filteredByValueStartingWithG")

    // task4 PrizeMap
    val prizeMap = mapOf(
        15 to 25.0,
        25 to 15.0,
        35 to 30.0,
        45 to 22.0,
        55 to 10.0
    )

    val filteredPrizeMap = prizeMap.filter { (key, value) -> key % 10 == 5 && value > 20 }
    println("Сотрудники с порядковым номером, оканчивающимся на '5' и процентом премии больше 20: $filteredPrizeMap")
}