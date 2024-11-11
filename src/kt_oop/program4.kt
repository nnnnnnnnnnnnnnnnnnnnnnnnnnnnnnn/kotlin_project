package kt_oop

/*
Создайте интерфейс Playable с методом play(). Затем создайте класс Guitar, который реализует этот интерфейс и выводит сообщение "Играет гитара" при вызове метода play().
Программа должна:
1. Считывать текстовую строку, представляющую команду, из
стандартного ввода.
2. Если команда равна "play", создать экземпляр класса Guitar и вызвать его метод play().
*/

interface Playable {
    fun play()
}

class Guitar : Playable {
    override fun play() {
        println("Играет гитара")
    }
}

fun main() {
    print("Введите команду: ")
    val command = readln()

    if (command == "play") {
        val guitar = Guitar()
        guitar.play()
    } else {
        println("Неизвестная команда")
    }
}
