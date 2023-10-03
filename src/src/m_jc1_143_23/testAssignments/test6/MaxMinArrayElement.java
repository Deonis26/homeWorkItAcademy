package m_jc1_143_23.testAssignments.test6;

// Найти максимальный и минимальные элементы массива и вывести их индексы на экран.

import java.util.Random;
import java.util.Scanner;

public class MaxMinArrayElement {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        Scanner scanner = new Scanner(System.in); //ввод с клавиатуры желаемого количества массива
        int a = scanner.nextInt();
        int[] numbers;
        numbers = new int[a];  // присвоение массиву рзмерности
        int indexMin = 0, indexMax = 0;
        for (int i = 0; i < numbers.length; i++) { // цикл по заполнения массива случайными числами
            numbers[i] = (int) (Math.random() * 40);
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                indexMin = i;
            }
        }
        for (int elements : numbers) {   //вывод массива
            System.out.print(elements + " ");
        }
        System.out.println();
        System.out.println("Индекс минимального значения: " + indexMin);
        System.out.println("Индекс максимального значения: " + indexMax);
    }
}
