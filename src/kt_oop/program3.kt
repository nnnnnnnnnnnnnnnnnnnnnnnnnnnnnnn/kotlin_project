package kt_oop

/*
Создайте класс MathOperations с методами add(), subtract(), multiply() и divide().
Перегрузите эти методы для работы с целыми числами (Int) и числами с
плавающей точкой (Double).
Программа должна:
1. Считывать тип данных (Int или Double), тип операции
(add, subtract, multiply, divide) и два числа.
2. Использовать объект класса MathOperations для выполнения указанной
операции.
3. Выводить результат операции в формате Double.
Входные данные:
Четыре строки:
1. Тип данных ("Int" или "Double").
2. Тип операции ("add", "subtract", "multiply", "divide").
3. Первое число.
4. Второе число.
*/

class MathOperations {
    fun add(a: Int, b: Int): Double {
        return (a + b).toDouble()
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Int, b: Int): Double {
        return (a - b).toDouble()
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Int, b: Int): Double {
        return (a * b).toDouble()
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Int, b: Int): Double {
        return if (b != 0) (a.toDouble() / b.toDouble()) else (0).toDouble()
    }

    fun divide(a: Double, b: Double): Double {
        return if (b != 0.0) (a / b) else (0).toDouble()
    }

}

fun main() {
    val math = MathOperations()

    print("Введите тип данных (Int или Double): ")
    val dataType = readln()

    print("Введите тип операции (add, subtract, multiply, divide): ")
    val operation = readln()

    print("Введите первое число: ")
    val input1 = readln()

    print("Введите второе число: ")
    val input2 = readln()

    val result: Double
    when (dataType) {
        "Int" -> {
            val num1 = input1.toIntOrNull()
            val num2 = input2.toIntOrNull()

            if (num1 == null || num2 == null) {
                println("Ошибка: неверный формат ввода")
                return
            }

            result = when (operation) {
                "add" -> math.add(num1, num2)
                "subtract" -> math.subtract(num1, num2)
                "multiply" -> math.multiply(num1, num2)
                "divide" -> math.divide(num1, num2)
                else -> {
                    println("Ошибка: нет такой операции")
                    return
                }
            }
        }
        "Double" -> {
            val num1 = input1.toDoubleOrNull()
            val num2 = input2.toDoubleOrNull()

            if (num1 == null || num2 == null) {
                println("Ошибка: неверный формат ввода")
                return
            }

            result = when (operation) {
                "add" -> math.add(num1, num2)
                "subtract" -> math.subtract(num1, num2)
                "multiply" -> math.multiply(num1, num2)
                "divide" -> math.divide(num1, num2)
                else -> {
                    println("Ошибка: нет такой операции")
                    return
                }
            }
        }
        else -> {
            println("Ошибка: неверный формат ввода")
            return
        }
    }

    println("Результат: $result")
}
