package m_jc1_143_23.tasksAssessment.task3;

// Создать двумерный квадратный массив размера n. Заполнить его случайными числами таким образом:
// числа по диагонали равны 0; вверху и снизу от пересечения диагоналей находятся только положительные числа (> 0);
// слева и справа от пересечения диагоналей находятся только отрицательные числа (< 0); Вывести массив на экран.
// Найти сумму всех элементов; Найти среднее арифметическое всех элементов, которые больше суммы всех элементов;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = scanner.nextInt();
        int arr[][];
                arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i==arr.length-1-j) { // определил диаганаль
                    arr[i][j] = 0;
                }  else {
                    arr[i][j] = (int) (Math.random() * 20);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
