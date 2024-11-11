package kt_oop

/*
Создайте суперкласс Person с двумя свойствами: name (имя)
типа String и role (роль) типа String. Реализуйте метод showinfo(), который выводит имя и роль пользователя. Создайте подклассы Moderator и Admin. Переопределите метод showlnfo() в каждом из подклассов так, чтобы он выводил соответствующую информацию о пользователе.
Программа должна:
1. Считывать имя и роль пользователя из стандартного ввода.
2. Создавать объект соответствующего класса (Moderator или Admin).
3. Вызывать метод showlnfo() для созданного объекта.
Входные данные:
Два слова - имя и роль пользователя ("Moderator" или "Admin").
*/

// переименовала, потому что конфликт с классом из первого задания
open class Persona(val name: String, val role: String) {
    open fun showInfo() {
        println("Name: $name, Role: $role")
    }
}

class Moderator(name: String) : Persona(name, "Moderator") {
    override fun showInfo() {
        println("Name: $name, Role: Moderator - имеет права на модерацию")
    }
}

class Admin(name: String) : Persona(name, "Admin") {
    override fun showInfo() {
        println("Name: $name, Role: Admin - имеет все возможные права")
    }
}

fun main() {
    print("Введите имя и роль пользователя (Moderator/Admin): ")
    val input = readln().split(" ")

    if (input.size != 2) {
        println("Ошибка: неверный формат ввода")
        return
    }

    val name= input[0]
    val role = input[1]

    val person = when (role) {
        "Moderator" -> Moderator(name)
        "Admin" -> Admin(name)
        else -> {
            println("Ошибка: неверно указана роль пользователя")
            return
        }
    }

    person.showInfo()
}
