package m_jc1_143_23.testAssignments.test8;

import java.util.Scanner;

//Дан текст. Поменяйте местами первое самое длинное слово с последним самым коротким.
public class RearrangementOfWords {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введить текст");
        // String text= scanner.nextLine();
        // System.out.println();
        // System.out.println(text);
        // String text="Algorithms are used as specifications for performing calculations and data processing.";
        String text = "I have a book.";
        //String text = "Hello world";
        //String text = "In mathematics and computer science, an algorithm is a finite sequence of rigorous instructions, " +
        //      "typically used to solve a class of specific problems or to perform a computation.";
        //String text = "The world is mine!";
        String bufferText = text;
        text = text.replaceAll("\\p{Punct}", ""); //мне подсказал интернет как удалить все знаки припенания
        String[] arr = text.split(" ");
        String minWord = arr[0];
        String maxWord = arr[0];
        int posMin = 0;
        int posMax = 0;
        String buffer;
        for (int i = 0; i < arr.length; i++) {
            if (minWord.length() >= arr[i].length()) {
                minWord = arr[i];
                posMin = i;
            }
            if (arr[i].length() > maxWord.length()) {
                maxWord = arr[i];
                posMax = i;
            }
        }
        buffer = arr[posMin];
        arr[posMin] = arr[posMax];
        arr[posMax] = buffer;
        System.out.println(minWord + " " + posMin);
        System.out.println(maxWord + " " + posMax);
        System.out.println();

       /* for (String k : arr) {
            System.out.print(k + " ");

        }*/
        String a="";
        for (int i = 0; i < arr.length; i++) {
            a=a+arr[i]+" ";
        }
        System.out.println(a);
        a=a.replaceAll("","");
        System.out.println();
        System.out.println(a);
        System.out.println(bufferText);
    }
}
