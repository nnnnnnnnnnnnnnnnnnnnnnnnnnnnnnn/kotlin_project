package kt_base

// Program4: считывает символ в нижнем регистре, преобразовывает его в верхний, а затем выводит код Unicode нового символа

fun toUpperUnicode() {
    print("Введите символ в нижнем регистре: ")
    val input = readln()

    if (input.length == 1) {
        val upperChar = input[0].uppercaseChar()
        val unicode = upperChar.code
        println("Код Unicode: $unicode")
    } else {
        println("Ошибка: введите один символ")
    }
}