package m_jc1_143_23.testAssignments.test11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File has been created");
            } else {
                System.out.println("File is already exist");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try (FileWriter writer1 = new FileWriter("example.txt")) {
            writer1.write("We are a company where creativity, technology savvy and innovative thinking thrive.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (Scanner scan1 = new Scanner(new FileReader("example.txt"))) {

            String str = scan1.nextLine();
            System.out.println(str);

            String[] strArray = str.split(" ");
            int numberOfWords = strArray.length;

            System.out.println("Number of words: " + numberOfWords);
            String withOutSymbol = str.replaceAll("[-.?!)(,:]", "");

            int symBol = str.length() - withOutSymbol.length();
            System.out.println("Number of symbol: " + symBol);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
