package m_jc1_143_23.tasksAssessment.task10;

import java.io.*;

//Заданы три файла с именами array1.txt, array2.txt, array3.txt. В каждом из файлов записаны целочисленные массивы согласно следующему формату:
//N
//number1
//number2
//...
//numberN
//где:
//N – количество чисел, которые сохранены в файле
//number1, number2, ..., numberN – непосредственно сами числа
//Зачитайте массивы из файлов, определите сумму и среднее арифметическое значений.
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int avg = 0;

//       Создание трёх файлов и запись целочисленные массивы согласно формату

        int n1 = 10;
        int n2 = 9;
        int n3 = 8;

        File array1 = new File("array1.txt");
        File array2 = new File("array2.txt");
        File array3 = new File("array3.txt");
//
        try {
            if (array1.createNewFile()) {
                System.out.println("File array1 has been created");
            } else {
                System.out.println("File array1 is already exist");
            }
            if (array2.createNewFile()) {
                System.out.println("File array2 has been created");
            } else {
                System.out.println("File array2 is already exist");
            }
            if (array3.createNewFile()) {
                System.out.println("File array3 has been created");
            } else {
                System.out.println("File array3 is already exist");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (BufferedWriter writer1 = new BufferedWriter(new FileWriter("array1.txt"));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter("array2.txt"));
             BufferedWriter writer3 = new BufferedWriter(new FileWriter("array3.txt"))
        ) {
            writer1.write(String.valueOf(n1));
            writer1.write("\n");
            writer2.write(String.valueOf(n2));
            writer2.write("\n");
            writer3.write(String.valueOf(n3));
            writer3.write("\n");

            for (int i = 0; i < n1; i++) {
                writer1.write((String.valueOf((int) (Math.random() * 100 + 1))));
                writer1.write("\n");
            }
            for (int i = 0; i < n2; i++) {
                writer2.write((String.valueOf((int) (Math.random() * 100 + 1))));
                writer2.write("\n");
            }
            for (int i = 0; i < n3; i++) {
                writer3.write((String.valueOf((int) (Math.random() * 100 + 1))));
                writer3.write("\n");
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (BufferedReader reader1 = new BufferedReader(new FileReader("array1.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("array2.txt"));
             BufferedReader reader3 = new BufferedReader(new FileReader("array3.txt"))
        ) {
            int num1 = Integer.parseInt(reader1.readLine());
            int num2 = Integer.parseInt(reader2.readLine());
            int num3 = Integer.parseInt(reader3.readLine());

            for (int i = 0; i < num1; i++) {
                sum += (Integer.parseInt(reader1.readLine()));
            }
            for (int i = 0; i < num2; i++) {
                sum += (Integer.parseInt(reader2.readLine()));
            }
            for (int i = 0; i < num3; i++) {
                sum += (Integer.parseInt(reader3.readLine()));
            }

            avg = sum / (num1 + num2 + num3);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(sum);
        System.out.println(avg);

    }
}
