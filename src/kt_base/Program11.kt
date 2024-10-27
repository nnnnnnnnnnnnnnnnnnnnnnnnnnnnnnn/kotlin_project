package kt_base

// Program11: принимает на вход целое число от 1 до 7 и выводит на экран день недели

fun showDayOfWeek() {
    print("Введите число от 1 до 7: ")
    try {
        var input = readln().toInt()
        val days = listOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
        println(days[input-1])
    }
    catch (e: Exception) {
        println("Ошибка: неверное значение")
    }
}