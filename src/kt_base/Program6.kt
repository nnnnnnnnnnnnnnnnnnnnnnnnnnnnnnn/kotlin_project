package kt_base

// Program6: Вводится строка, программу, удаляет из нее первые два элемента и вставляет их в конец

fun twoToEnd() {
    print("Введите строку: ")
    var input = readln()
    if (input.length >= 2) {
        println("${input.subSequence(2,input.length)}${input.subSequence(0,2)}")
    }
}