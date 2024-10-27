package kt_base

import java.util.*

// Program15: Вводится длина массива. Затем вводится длина для нового массива. Напишите программу, которая создаёт массив из этих чисел и выводит их новый массив, содержащий все те же числа, но в обратном порядке

fun flipArray() {
    try {
        print("Введите длину массива: ")
        var size = readln().toInt()
        print("Введите длину нового массива: ")
        var newSize = readln().toInt()
        val array = IntArray(size) { Random().nextInt(100) }
        println("Старый массив: ${array.toList()}")
        val newArray = IntArray(newSize)
        for (i in 0..<newSize) {
            if (size-i-1 < 0) { break }
            newArray[i] = array[size-i-1]
        }
        println("Новый массив: ${newArray.toList()}")
    }
    catch (e: Exception) {
        println("Ошибка: неверное значение")
    }
}