package m_jc1_143_23.testAssignments.test1;
// Имеется прямоугольное отверстие размером a на b.
// Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r.

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        System.out.println("Введите r: ");
        int r = scanner.nextInt();
        double hypotenuse = Math.sqrt(a * a + b * b);
        if (2 * r > hypotenuse) {
            System.out.println("Картонка с радиусом " + r + " закрывает полностью отверстие размера " + a + " * " + b);
        } else {
            System.out.println("Картонка с радиусом " + r + " не закрывает полностью отверстие размера " + a + " * " + b);
        }
    }
}
