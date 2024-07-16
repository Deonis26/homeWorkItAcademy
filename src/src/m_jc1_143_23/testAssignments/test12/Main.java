package m_jc1_143_23.testAssignments.test12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Записать в двоичный файл 30 случайных чисел от 1 до 100. Прочитать записанный файл распечать числа и их среднее арифметическое.
public class Main {
    public static void main(String[] args) {
        File file = new File("random_numbers.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File has been created");
            } else {
                System.out.println("File is already exist");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter("random_numbers.txt")) {
            for (int i = 0; i < 30; i++) {
                writer.append(String.valueOf((byte) (Math.random() * 100 + 1)));
                writer.write(" ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (Scanner scan = new Scanner(new FileReader("random_numbers.txt"))) {
            String str = scan.nextLine();
            System.out.println("Values from byte file: " + str);
            String[] strArray = str.split(" ");
            int avg = 0;
            int sum = 0;
            for (String s : strArray) {
                sum += Integer.parseInt(s);
                avg++;
            }
            System.out.println("Average value: " + sum / avg);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

