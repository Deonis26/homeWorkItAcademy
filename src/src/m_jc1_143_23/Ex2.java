package m_jc1_143_23;

import java.util.Arrays;
import java.util.Random;

//Сгенерировать массив случайных целых чисел, величина которых,
//по модулю, не превышает 300 (-300 ... 300).
//Число элементов массива равно 10.
//Найти максимальное и минимальное числа в  массиве и вывести на экран.
//Заменить максимальный элемент на минимальный, умноженный на максимальный.
public class Ex2 {
    public static void main(String[] args) {
        int max = -300;
        int min = 600;
        int size = 10;
        int minSize = 0;
        int maxSize = 0;
        int[] massive = new int[size];
        for (int i = 0; i < size; i++) {
            massive[i] = (int) (Math.random() * 601 - 300);
        }

        System.out.println(Arrays.toString(massive));

        for (int i = 0; i < size; i++) {
            if (massive[i] > max) {
                max = massive[i];
                maxSize = i;
            }
            if (massive[i] < min) {
                min = massive[i];
                minSize = i;
            }
        }
        System.out.println();
        System.out.println("минимальный элемент: " + min);
        System.out.println("максимальный элемент: " + max);
        System.out.println("Максимальный индекс элемента " + maxSize);
        System.out.println("Минимальный индекс элемента " + minSize);
        massive[maxSize] = massive[minSize] * massive[maxSize];
        System.out.println(Arrays.toString(massive));
    }
}

