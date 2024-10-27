package kt_base

// Напишите программу, которая принимает элементы списка через запятую и возвращает Map, где ключи - уникальные элементы списка, а значения - количество раз, которое каждый элемент встречается в списке

fun countMap() {
    try {
        println("Введите элементы списка через запятую с пробелом: ")
        val input = readln()
        val elements = input.split(", ")
        val map = mutableMapOf<String, Int>()
        for (value in elements) {
            val count = map.getOrDefault(value, 0)
            map[value] = count + 1
        }
        println(map)
    }
    catch (e: Exception) {
        println("Ошибка: неверное значение")
    }
}