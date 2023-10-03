package m_jc1_143_23.tasksAssessment.task2;

// Улитка поднимается по дереву на a футов в день. Затем каждую ночь улитка сползает вниз на b футов. Высота дерева — h футов.
// Напишите программу с подсчетом количества дней, которые потребуются улитке, чтобы добраться до вершины дерева.
// Если улитка не может добраться до вершины дерева, должно выводиться сообщение: Невозможно.

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        int day;
        int path = 0;
        System.out.println("Введите a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        System.out.println("Введите h: ");
        int h = scanner.nextInt();
        for (day = 0; path < h; day++) {
            if (a > b && a < h) {
                path = path + a;
                path = path - b;
            } else if (a >= h) {
                day = day + 1;
                break;
            } else {
                System.out.println("Невозможно");
                break;
            }
        }
        if (day > 0) {
            System.out.println("Количество дней: " + day);
        }
    }
}
