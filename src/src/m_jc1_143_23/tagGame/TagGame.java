package m_jc1_143_23.tagGame;

import java.util.Random;
import java.util.Scanner;

public class TagGame {
    public static void main(String[] args) {
        Integer[][] tags = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
        String massive = "";
        for (int i = 0; i < tags.length; i++) {
            for (int j = 0; j < tags.length; j++) {
                massive = massive + tags[i][j] + " ";
            }
        }
        Random random = new Random();
        int i;
        int j;
        int tags0i = 0;
        int tags0j = 0;
        int temp5i = 0;
        int temp5j = 0;
        boolean win = false;
        for (i = 0; i < tags[i].length - 1; i++) {
            for (j = 0; j < tags[j].length - 1; j++) {
                int index = random.nextInt(j, 4);
                int temp = tags[i][j];
                tags[i][j] = tags[index][index];
                tags[index][index] = temp;
            }
        }
        for (i = 0; i < tags.length; i++) {
            System.out.println();
            for (j = 0; j < tags.length; j++) {
                if (tags[i][j] == 0) {
                    System.out.print("[ ] ");
                    tags0i = i;
                    tags0j = j;
                    continue;
                }
                System.out.print(tags[i][j] + "  ");
            }
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер пятнашнки от 1 до 15: ");
        while (!win) {
            System.out.println();
            int a = scanner.nextInt();
            for (i = 0; i < tags.length; i++) {
                for (j = 0; j < tags.length; j++) {
                    if (a == tags[i][j] && (i == tags0i || j == tags0j)) {
                        if (i + 1 == tags0i || j + 1 == tags0j || tags0i + 1 == i || tags0j + 1 == j || tags0i - 1 == i) {
                            int temp = tags[i][j];
                            tags[i][j] = tags[tags0i][tags0j];
                            tags[tags0i][tags0j] = temp;
                            temp5i = i;
                            temp5j = j;
                            continue;
                        }
                        if (i > tags0i + 2) {
                            int temp = tags[i][j];
                            tags[i][j] = tags[tags0i][tags0j];
                            int temp1 = tags[i - 1][j];
                            int temp2 = tags[i - 2][j];
                            tags[i - 1][j] = temp;
                            tags[i - 2][j] = temp1;
                            tags[tags0i][tags0j] = temp2;
                            temp5i = i;
                            temp5j = j;
                        }
                        if (i > tags0i + 1 && i <= tags0i + 2) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tags[i][j];
                            int temp1 = tags[i - 1][j];
                            tags[i][j] = tags[tags0i][tags0j];
                            tags[i - 1][j] = temp;
                            tags[tags0i][tags0j] = temp1;
                        }
                        if (j > tags0j + 2) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tags[i][j];
                            tags[i][j] = tags[tags0i][tags0j];
                            int temp1 = tags[i][j - 1];
                            int temp2 = tags[i][j - 2];
                            tags[i][j - 1] = temp;
                            tags[i][j - 2] = temp1;
                            tags[tags0i][tags0j] = temp2;
                        }
                        if (j > tags0j && j <= tags0j + 2) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tags[i][j];
                            int temp1 = tags[i][j - 1];
                            tags[i][j] = tags[tags0i][tags0j];
                            tags[i][j - 1] = temp;
                            tags[tags0i][tags0j] = temp1;

                        }
                        if (tags0j > j && tags0j < j + 3) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tags[i][j];
                            int temp1 = tags[i][j + 1];
                            tags[i][j] = tags[tags0i][tags0j];
                            tags[i][j + 1] = temp;
                            tags[tags0i][tags0j] = temp1;
                            break;
                        }
                        if (tags0i > i && tags0i == i + 1) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tags[i][j];//1
                            int temp1 = tags[i + 1][j];//9
                            tags[i][j] = tags[tags0i][tags0j];//[0]
                            tags[i + 1][j] = temp;
                            tags[tags0i][tags0j] = temp1;
                            a = tags[i][j];
                        }
                        if (tags0i > i && tags0i > i + 2) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tags[i][j];
                            tags[i][j] = tags[tags0i][tags0j];
                            int temp1 = tags[i + 1][j];
                            int temp2 = tags[i + 2][j];
                            tags[i + 1][j] = temp;
                            tags[i + 2][j] = temp1;
                            tags[tags0i][tags0j] = temp2;
                            a = tags[i][j];
                            break;
                        }
                        if (tags0i > i && tags0i > i + 1) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tags[i][j];
                            tags[i][j] = tags[tags0i][tags0j];
                            int temp1 = tags[i + 1][j];
                            tags[i + 1][j] = temp;
                            tags[tags0i][tags0j] = temp1;
                            a = tags[i][j];
                            break;
                        }
                        if (tags0j > j) {
                            int temp = tags[i][j];
                            int temp1 = tags[i][j + 1];
                            int temp2 = tags[i][j + 2];
                            temp5i = i;
                            temp5j = j;
                            tags[i][j] = tags[tags0i][tags0j];
                            tags[i][j + 1] = temp;
                            tags[i][j + 2] = temp1;
                            tags[tags0i][tags0j] = temp2;
                            break;
                        }
                    }
                }
            }
            for (int k = 0; k < tags.length; k++) {
                for (int l = 0; l < tags.length; l++) {
                    if (tags[k][l] == 0) {
                        System.out.print("[ ] ");
                        continue;
                    }
                    System.out.print(tags[k][l] + " ");
                }
                System.out.println();
            }
            String massive1 = "";
            for (int k = 0; k < tags.length; k++) {
                for (int l = 0; l < tags.length; l++) {
                    massive1 = massive1 + tags[k][l] + " ";
                }
            }
            if (massive.equals(massive1)) {
                win = true;
                System.out.println("Победа!! ");
                break;
            }
            tags0i = temp5i;
            tags0j = temp5j;
            System.out.println();
            System.out.println("Ваш ход: ");
        }
    }
}

