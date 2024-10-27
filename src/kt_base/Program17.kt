package kt_base

// На вход программе подаётся число  элементов первого множества. Затем число второго множества. Напишите программу, которая создаёт два множества из данных элементов и возвращает их объединение

fun uniteSets() {
    try {

        print("Введите длину первого множества: ")
        val size1 = readln().toInt()
        if (size1 < 0) {
            error("")
        }

        println("Введите элементы первого множества: ")
        val set1 = mutableSetOf<String>()
        repeat(size1) {
            set1.add(readln())
        }

        print("Введите длину второго множества: ")
        val size2 = readln().toInt()
        if (size2 < 0) {
            error("")
        }

        println("Введите элементы второго множества:")
        val set2 = mutableSetOf<String>()
        repeat(size2) {
            set2.add(readln())
        }

        println(set1 union set2)


    }
    catch (e: Exception) {
        println("Ошибка: неверное значение")
    }
}