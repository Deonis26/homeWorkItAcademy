package m_jc1_143_23.tasksAssessment.task8;
//Дано 2 файла - in1.txt и in2.txt в каждом файле по 1000 чисел от 1 до 100000.
// Создайте файл out.txt, который будет содержать все отсортированные числа из файлов in1.txt и in2.txt.
//Файлы in1.txt и in2.txt можно создать с помощью кода.

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        File in1 = new File("in1.txt");
        File in2 = new File("in2.txt");
        File out = new File("Out.txt");

        try {
            if (in1.createNewFile()) {
                System.out.println("File in1 has been created");
            } else {
                System.out.println("File in1 is already exist");
            }
            if (in2.createNewFile()) {
                System.out.println("File in2 has been created");
            } else {
                System.out.println("File in2 is already exist");
            }
            if (out.createNewFile()) {
                System.out.println("File out has been created");
            } else {
                System.out.println("File out is already exist");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (BufferedWriter writer1 = new BufferedWriter(new FileWriter("in1.txt"));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter("in2.txt"))
        ) {
            for (int i = 0; i < 1000; i++) {
                writer1.write((String.valueOf((int) (Math.random() * 100000 + 1))));
                writer1.write("\n");
                writer2.write((String.valueOf((int) (Math.random() * 100000 + 1))));
                writer2.write("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (BufferedReader reader1 = new BufferedReader(new FileReader("in1.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("in2.txt"))
        ) {
            while (reader1.ready()) {
                numbers.add(Integer.parseInt(reader1.readLine()));
            }
            while (reader2.ready()) {
                numbers.add(Integer.parseInt(reader2.readLine()));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
        ) {
            String[] str = numbers.toString().substring(1, numbers.toString().length() - 1).split(", ");
            for (int i = 0; i < 2000; i++) {
                writer.write(str[i] + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}