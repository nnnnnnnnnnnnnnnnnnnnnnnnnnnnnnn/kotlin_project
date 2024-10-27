package kt_base

// На вход программе подаётся число n и n элементов первого множества, каждый на новой строке. Затем число m и m элементов второго  множества, каждый на новой строке. Напишите программу, которая создаёт два множества из данных элементов и возвращает их общие элементы

fun commonElements() {
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

        println(set1 intersect set2)


    }
    catch (e: Exception) {
        println("Ошибка: неверное значение")
    }
}