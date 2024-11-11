package kt_oop

/*
Создайте класс Car с двумя свойствами: brand (марка автомобиля)
типа String и year (год выпуска) типа Int. Реализуйте метод printDetails(), который будет выводить в консоль информацию о марке и годе выпуска автомобиля. Программа должна:
1. Считывать количество автомобилей из стандартного ввода.
2. Считывать данные каждого автомобиля (марка и год выпуска) из стандартного ввода.
3. Для каждого автомобиля создавать экземпляр класса Car и вызывать метод printDetails(), чтобы вывести информацию о марке и годе выпуска автомобиля.
Входные данные:
Сначала одно целое число пп - количество автомобилей. Далее следуют п строк, каждая из которых содержит марку автомобиля и год выпуска через пробел.
Выходные данные:
Для каждого автомобиля выведите информацию в формате:
Brand: <марка>, Year: <год>
*/

class Car(private var brand: String, private var year: Int) {
    fun printDetails() {
        println("Brand: $brand, Year: $year")
    }
}

fun main() {
    print("Ведите количество автомобилей: ")
    val n = readln().toIntOrNull() ?: return println("Ошибка: введите целое число")

    val cars = mutableListOf<Car>()

    repeat(n) {
        print("Введите марку и год выпуска через пробел: ")
        val input = readln().split(" ")

        if (input.size != 2) {
            println("Ошибка: неверный формат ввода")
            return
        }
        val brand = input[0]
        val year = input[1].toIntOrNull() ?: return println("Ошибка: неверный формат ввода")
        val car = Car(brand, year)
        cars.add(car)
    }

    for (car in cars) {
        car.printDetails()
    }
}
