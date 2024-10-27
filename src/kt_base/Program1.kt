package kt_base

// Program1: находит среднее арифметическое трёх введённых чисел с плавающей точкой

    fun findAverage() {
        println("Введите 3 числа с плавающей точкой (нажмите Enter после каждого числа):")
        val floatArray = FloatArray(3)
        for (i in 1..3) {
            var validInput = false
            while (!validInput) {
                try {
                    print("${i} число: ")
                    floatArray[i - 1] = readln().toFloat()
                    validInput = true
                }
                catch(e: Exception) {
                    println("Неверный формат ввода, попробуйте еще раз")
                }
            }
        }
        println(floatArray.sum() / floatArray.size)
    }

