package kt_base

// Program2: проверяет, является ли введенный символ буквой, выводя true или false

fun isLetter() {
    print("Введите символ для проверки: ")
    val input = readln()

    if (input.length == 1) {
        val character = input[0]
        println(character.isLetter())
    } else {
        println("Ошибка: вы ввели несколько символов")
    }
}