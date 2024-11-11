package kt_oop

/*
Создайте классы Animal, Dog, Cat и Bird. Класс Animal должен содержать метод sound(), который выводит соответствующий звук для каждого вида животного. Каждый подкласс должен переопределить метод sound(). Программа должна:
1. Считывать название животного из стандартного ввода.
2. Создавать объект соответствующего класса (Dog, Cat или Bird). 3. Вызывать метод sound() для созданного объекта.
Входные данные:
Одно слово - название животного ("Dog", "Cat" или "Bird").
*/

open class Animal {
    open fun sound() {
        println("Какой-то звук")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Гав")
    }
}

class Cat : Animal() {
    override fun sound() {
        println("Мяу")
    }
}

class Bird : Animal() {
    override fun sound() {
        println("Чирик-чирик")
    }
}

fun main() {
    print("Введите название животного (Dog/Cat/Bird): ")
    val animalType = readln()

    val animal = when (animalType) {
        "Dog" -> Dog()
        "Cat" -> Cat()
        "Bird" -> Bird()
        else -> {
            println("Неизвестное животное")
            return
        }
    }
    animal.sound()
}