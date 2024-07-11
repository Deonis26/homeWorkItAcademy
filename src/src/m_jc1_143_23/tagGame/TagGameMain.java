package m_jc1_143_23.tagGame;

import java.util.Random;
import java.util.Scanner;

public class TagGameMain {
    public static void main(String[] args) {
        System.out.println("new game (n)");
        System.out.println("save game (s)");
        System.out.println("load game (l)");
        System.out.println("quit game (q)");
        Scanner scanner = new Scanner(System.in);
        String  menuSelection= scanner.next();
        System.out.println();
        switch (menuSelection) {
            case "n":
                TagGame tag = new TagGame();
                System.out.println(tag);
                tag.win();
                break;
            case "s":
                System.out.println("нет реализации");
                break;
            case "l":
                System.out.println("нет реализации");
                break;
            case "q":
                break;
        }
    }
}



