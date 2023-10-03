package m_jc1_143_23.testAssignments.test2;

//Напишите программу расчета даты следующего дня введя 3 числа - день, месяц и год.

import java.util.Scanner;

public class DateCalculation {
    public static void main(String[] args) {
        int newDay;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите год: ");
        int age = scanner.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                day = day + 1;
                if (day > 31) {
                    day = 1;
                    month = month + 1;
                    if (month > 12) {
                        month = 1;
                        age = age + 1;
                    }
                }
                System.out.println("Следующий день: " + day + " " + month + " " + age);
                break;
            case 2:
                day = day + 1;
                if (age % 4 == 0 && day > 28) {
                    day = 29;
                } else if (day > 28) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println("Следующий день: " + day + " " + month + " " + age);
                break;
            case 4, 6, 9, 11:
                day = day + 1;
                if (day > 30) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println("Следующий день: " + day + " " + month + " " + age);
                break;
        }
    }
}
