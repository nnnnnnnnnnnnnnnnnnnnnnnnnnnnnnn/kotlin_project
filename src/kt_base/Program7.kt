package kt_base

// Program7: реализовать программу которая безопасно вызовет свойство length на строке и выведет результат, если строка не null

fun getLength() {
    print("Введите строку: ")
    val input = readln()
    var inputLength = input.length
    if (inputLength != 0) {
        println("Длина введенной строки: $inputLength")
    } else {
        println("Ошибка: строка пустая")
    }
}