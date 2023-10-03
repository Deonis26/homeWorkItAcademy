package m_jc1_143_23.testAssignments.test7;
// Создать массив заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать.
// При перевороте элементов не желательно создавать еще один массив.

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int a = scanner.nextInt();
        int[] arr;
        arr = new int[a];
        // int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20 - 5);
        }
        System.out.println();
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1 - i; i++) {
            int temp = arr[i];
            arr[i] = arr[a - 1];
            arr[a - 1] = temp;
            a--;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
