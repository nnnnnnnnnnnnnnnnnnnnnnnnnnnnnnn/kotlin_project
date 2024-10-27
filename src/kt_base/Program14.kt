package kt_base

import java.util.*


// Program14: вводится число, после него вводится число элементов массива. Программа создаёт массив из этих чисел и проверяет, содержится ли в нем заданное число. Если число есть - выведите в консоль true, иначе - false

fun findInArray() {
    try {
        print("Введите число: ")
        var number = readln().toInt()
        print("Введите размер массива: ")
        var size = readln().toInt()
        val array = IntArray(size) { Random().nextInt(100) }.asList()
//        println(array)
        println(number in array)
    }
    catch (e: Exception) {
        println("Ошибка: неверное значение")
    }
}