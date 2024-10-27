package kt_base

// Program5: получает на вход 5 строк и выводит объединённые строки

fun joinStrings() {
    var resultString = ""

    println("Введите 5 строк:")

    for (i in 1..5) {
        print("Строка $i: ")
        resultString += readln()
    }

    println("$resultString")
}