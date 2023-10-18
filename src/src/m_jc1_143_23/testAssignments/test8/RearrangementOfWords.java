package m_jc1_143_23.testAssignments.test8;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;
import java.util.regex.Pattern;

//Дан текст. Поменяйте местами первое самое длинное слово с последним самым коротким.
public class RearrangementOfWords {
    public static void main(String[] args) {
        //String text="Algorithms are used as specifications for performing calculations and data processing.";
        //String text = "I have a book.";
        //String text = "Hello world";
        //String text = "In mathematics and computer science, an algorithm is a finite sequence of rigorous instructions, " +
        //      "typically used to solve a class of specific problems or to perform a computation.";
        String text = "The world is mine!";
        String bufferText = text;
        text = text.replaceAll("\\p{Punct}", " $0"); //мне подсказал интернет как отделить все знаки препинания
        String[] arr = text.split(" ");
        String minWord = arr[0];
        String maxWord = arr[0];
        int posMin = 0;
        int posMax = 0;
        String buffer;
        for (int i = 0; i < arr.length; i++) {
            if (minWord.length()>= arr[i].length()){
               if(arr[i].equals(".") || arr[i].equals("!") || arr[i].equals(",")){
                   continue;
                }
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
        System.out.println("Минимальный элемент: "+minWord + " - позиция: " + posMin);
        System.out.println("Максимальный элемент: "+maxWord + " - позиция: " + posMax);
        System.out.println();
        String textNew="";
        for (int i = 0; i < arr.length; i++) {
            textNew=textNew+arr[i]+" ";
        }
        textNew=textNew.replaceAll("\\s+\\B", ""); //полтора часа блииииииииииииин
        System.out.println(textNew);
        System.out.println(bufferText);


    }
}
