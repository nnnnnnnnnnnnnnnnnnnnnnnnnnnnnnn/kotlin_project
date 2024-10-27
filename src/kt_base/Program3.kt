package kt_base

// Program3: преобразует два введённых символа в Unicode и выводит их разность

fun differenceInUnicode() {
    println("Введите два символа:")
    print("Первый символ: ")
    val char1 = readln()
    print("Второй символ: ")
    val char2 = readln()

    if (char1.length == 1 && char2.length == 1) {
        val unicode1 = char1[0].code
        val unicode2 = char2[0].code

        println("Разность в Unicode: ${unicode1 - unicode2}")
    } else {
        println("Ошибка: введите ровно по одному символу")
    }
}