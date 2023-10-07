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
        int summaMatrix = 0;
        double arithmeticMean = 0;
        int counter=0;

        int arr[][];
        arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == arr.length - 1 - j) {
                    arr[i][j] = 0;
                } else if (i < j && j < arr.length - 1 - i) {
                    arr[i][j] = (int) (Math.random() * 20);
                } else if (j > i && i > arr.length - 1 - j) {
                    arr[i][j] = (int) (Math.random() * -20);
                } else if (i > j && j > arr.length - 1 - i) {
                    arr[i][j] = (int) (Math.random() * 20);
                } else {
                    arr[i][j] = (int) (Math.random() * -20);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j] + " ");
                summaMatrix = summaMatrix + arr[i][j];
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (summaMatrix < arr[i][j]) {
                    arithmeticMean =arithmeticMean+arr[i][j];
                    counter++;
                }
            }

        }
        arithmeticMean=arithmeticMean/counter;
        System.out.println();
        System.out.println("Сумма всех элементов: " + summaMatrix);
        System.out.println("Cреднее арифмитическое всех элементов больше " + summaMatrix + ": "+arithmeticMean);

    }
}
