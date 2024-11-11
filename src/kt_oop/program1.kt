package kt_oop

/*
Создайте класс Person с полем name, доступным только внутри класса. Реализуйте метод setName(newName: String), который будет устанавливать значение поля name, и метод printName(), который будет выводить имя на консоль.
Программа должна:
1. Считывать количество людей из стандартного ввода.
2. Считывать имя каждого человека из стандартного ввода.
3. Для каждого человека создавать экземпляр класса Person, устанавливать имя с помощью метода setName(newName: String), и вызывать метод printName() для вывода имени на консоль.
Входные данные:
Сначала одно целое число n - количество людей. Далее следуют и строк, каждая из которых содержит одно имя.
Выходные данные:
Для каждого человека выведите его имя в формате:
Name: <имя>
*/

open class Person {
    private var name: String = ""

    fun setName(newName: String) {
        name = newName
    }

    fun getName(): String {
        return name
    }

    fun printName() {
        println("Name: $name")
    }
}

fun main() {
    print("Введите количество людей: ")
    // toIntOrNull возвращает null в случае неверного значения
    // Элвис (?:) вызывется, если результат null, иначе присваивается введенное значение (в нашем случае цлое число)
    val n = readln().toIntOrNull() ?: return println("Ошибка: введите целое число")

    val people = mutableListOf<Person>()
    println("Введите имена (каждое имя на новой строке)")
    repeat(n) {
        val person = Person()
        val name = readln()
        person.setName(name)
        people.add(person)
    }

    println("Вот, что получилось")
    for (person in people) {
        person.printName()
    }
}
