package m_jc1_143_23.testAssignments.test5;

// Введите число с клавиатуры. Определите, является ли это число простым.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        boolean indicator = false;
        for (int i = 2; i < a; i++) {
            if (a <= 3) {
                indicator = false;
                break;
            }
            if (a % i == 0) {
                indicator = true;
                break;
            }
            indicator = false;
        }
        if (indicator == true) {
            System.out.println("Число " + a + " не простое");
        } else {
            System.out.println("Число " + a + " простое");
        }
    }
}
