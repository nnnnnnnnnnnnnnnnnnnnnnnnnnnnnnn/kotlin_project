package kt_base

// Program9: проверяет, является ли введенное пользователем число четным или нечетным. Выведите соответствующее сообщение

fun checkEvenOrOdd() {
    try {
        print("Введите число: ")
        var number = readln().toInt()
        if (number % 2 == 0) {
            println("Четное")
        } else {
            println("Нечетное")
        }
    }
    catch (e: Exception)
    {
        println("Ошибка: введено некорректное значение")
    }
}