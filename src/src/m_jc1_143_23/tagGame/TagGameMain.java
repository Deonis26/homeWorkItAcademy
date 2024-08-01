package m_jc1_143_23.tagGame;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TagGameMain {
    public static void main(String[] args) {
        System.out.println("new game (n)");
        System.out.println("save game (s)");
        System.out.println("load game (l)");
        System.out.println("quit game (q)");
        Scanner scanner = new Scanner(System.in);
        String menuSelection = scanner.next();
        System.out.println();
        TagGame tag = new TagGame();
        switch (menuSelection) {
            case "n":
                //TagGame tag = new TagGame();
                System.out.println(tag);
                tag.win();
                break;
            case "s":
                tag.saveGame();
                tag.win();
                break;
            case "l":
                tag.loadGame();
                System.out.println(tag);
                tag.win();
                break;
            case "q":
                tag.quit();
                break;
        }

    }
}



