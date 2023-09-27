//Дана квадратная матрица N×N, состоящая из натуральных чисел.
//Зеркально отразить ее элементы относительно побочной диагонали.
//Вывести результат на экран.
//Высокий уровень 13 вариант SaidbaevAP 22-ISP-3/1

fun main() {
    val N = 3 // размер матрицы N

    val matrix = Array(N) { i -> IntArray(N) { j -> (i * N + j + 1) } } // Создаем квадратную матрицу
    println("Исходная матрица:") //вывод исходной матрицы
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matrix[i][j]} ")
        }
        println()
    }

    val mirroredMatrix = Array(N) { i -> IntArray(N) { j -> matrix[N - 1 - j][N - 1 - i] } } //Зеркалим

    println("Результат:")//Результат
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${mirroredMatrix[i][j]} ")
        }
        println()
    }
}
