package kt_base

// Program16: Вводится длина списка. Затем - n элементов списка, каждый на новой строке. Напишите программу, которая выводит множество из уникальных элементов в оригинальном порядке

fun getOrderedUniqueElements() {
    try {
        print("Введите длину списка: ")
        var input = readln().toInt()
        if (input <= 0) {
            error("")
        }

        val elements = mutableListOf<String>()

        println("Введите $input элементов:")
        for (i in 1..input) {
            elements.add(readln())
        }

        val uniqueElements = elements.toSet()
        println(uniqueElements)
    }
    catch (e: Exception) {
        println("Ошибка: неверное значение")
    }
}