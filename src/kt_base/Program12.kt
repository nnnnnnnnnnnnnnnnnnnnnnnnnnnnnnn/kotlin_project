package kt_base

// Program12: Вводится число, программа должна выводит удвоенные числа от 1 до n (обе границы не включены в диапозон)

fun getDoubleNumbers() {
    print("Введите число: ")
    try {
        var input = readln().toInt()
        for (i in 2..input-1) {
            print("${i * 2} ")
        }
        println()
    }
    catch (e: Exception) {
        println("Ошибка: неверное значение")
    }
}