package m_jc1_143_23.tagGame;

import java.util.Scanner;

public class Menu {
    //String menuSelection;
    public Menu(TagGame tag) {
                System.out.println("new game (n)");
        System.out.println("save game (s)");
        System.out.println("load game (l)");
        System.out.println("quit game (q)");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String menuSelection = scanner.next();
        switch (menuSelection) {
            case "n":
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

