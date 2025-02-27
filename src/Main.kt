fun main() {
    println("Kotlin Calculator")

    while (true) {
        print("\nEnter the first number: ")
        val firstNumber: Float = readln().toFloat()

        print("Enter the second number: ")
        val secondNumber: Float = readln().toFloat()


        print(
            """You can choose between 4 Operators,
        |1. '+' (addition), 
        |2. '-' (subtraction), 
        |3. '*' (multiplication) & 
        |4. '/' (division) 
        |
        |Choose which Operation you need (only the number): """.trimMargin()
        )

        var operation: Int = readln().toInt()

        while (operation !in 1..4) {
            println("Invalid Input. Number must be between 1 and 4")
            operation = readln().toInt()
        }
        val result: Float = when (operation) {
            1 -> firstNumber + secondNumber
            2 -> firstNumber - secondNumber
            3 -> firstNumber * secondNumber
            4 -> {
                if (secondNumber == 0f) {
                    println("Can't divide by 0\n")
                    continue
                }
                firstNumber / secondNumber
            }

            else -> {
                println("Unknown operation\n")
                continue
            }
        }
        println("\nThe result is: $result")
        break
    }
}

