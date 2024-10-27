package kt_base

// Program13: Реализовать обратный отсчет до старта, пользователь вводит число. Должна быть проверка.

fun countToStart() {
    print("Введите число: ")
    try {
        var input = readln().toInt()
        if (input < 1) {
            println("Ошибка: число меньше единицы, нет смысла считать")
            return
        }
        for (i in input downTo 1) {
            println("${i}...")
        }
        println("Старт!")
    }
    catch (e: Exception) {
        println("Ошибка: неверное значение")
    }
}