package kt_oop

/*

Создайте класс Person с полем name, доступным только внутри класса. Создайте класс Student, который наследует класс Person и имеет дополнительное поле studentld, доступное в подклассах. Реализуйте методы setName(newName: String) и printName() в классе Person, а также методы setstudentId(newld: Int) и printStudentDetails() в классе Student, который будет выводить на консоль имя и идентификатор студента.
Программа должна:
1. Считывать количество студентов из стандартного ввода.
2. Считывать данные каждого студента (имя и идентификатор) из стандартного ввода.
3. Для каждого студента создавать экземпляр класса Student, устанавливать имя и идентификатор с помощью соответствующих методов, и вызывать метод printStudentDetails() для вывода данных студента на консоль.
Входные данные:
Сначала одно целое число n - количество студентов. Далее следуют и строк, каждая из которых содержит имя и идентификатор студента через пробел. Выходные данные:
Для каждого студента выведите его данные в формате:
Name: <имя>, Student ID: <идентификатор>
*/

class Student : Person() {
    protected var studentId: Int = 0

    // Переименовала, потому что он жалуется. Нужно или private использовать или метод переименовать, но по заданию требуется protected
    // Kotlin: Platform declaration clash: The following declarations have the same JVM signature (setStudentId(I)V):
    //    fun `<set-studentId>`(`<set-?>`: Int): Unit defined in kt_oop.Student
    //    fun setStudentId(newId: Int): Unit defined in kt_oop.Student
    fun setId(newId: Int) {
        studentId = newId
    }

    fun printStudentDetails() {
        printName()
        println("Name: ${getName()}, Student ID: $studentId")
    }
}

fun main() {
    print("Введите количество студентов: ")
    val n = readln().toIntOrNull() ?: return println("Ошибка: введите целое число")

    val students = mutableListOf<Student>()
    println("Введите данные студентов (имя и идентификатор через пробел):")
    repeat(n) {
        val input = readln().split(" ")
        if (input.size != 2) {
            println("Ошибка: неверный формат ввода")
            return
        }

        val name = input[0]
        val id = input[1].toIntOrNull() ?: return println("Ошибка: неверный формат ввода")

        val student = Student()
        student.setName(name)
        student.setId(id)
        students.add(student)
    }

    println("")
    for (student in students) {
        student.printStudentDetails()
    }
}
