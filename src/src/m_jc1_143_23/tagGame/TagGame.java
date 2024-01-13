package m_jc1_143_23.tagGame;

import java.util.Random;
import java.util.Scanner;

public class TagGame {
    public static void main(String[] args) {
        Integer[][] tags = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
        Random random = new Random();
        int i;
        int j;
        int tags0i = 0;
        int tags0j = 0;
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
        int a = scanner.nextInt();
        for (i = 0; i < tags.length; i++) {
            for (j = 0; j < tags.length; j++) {
                if (a == tags[i][j] /*&& (i == tags0i || j == tags0j)*/) {
                    if (i + 1 == tags0i || j + 1 == tags0j || tags0i + 1 == i || tags0j + 1 == j || tags0i - 1 == i) {
                        int temp = tags[i][j];
                        tags[i][j] = tags[tags0i][tags0j];
                        tags[tags0i][tags0j] = temp;
                        System.out.println("1");
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
                    }
                    if (i > tags0i + 1 && i <= tags0i + 2) {
                        int temp = tags[i][j];
                        int temp1 = tags[i - 1][j];
                        tags[i][j] = tags[tags0i][tags0j];
                        tags[i - 1][j] = temp;
                        tags[tags0i][tags0j] = temp1;
                    }
                    if (j > tags0j + 2) {
                        int temp = tags[i][j];
                        tags[i][j] = tags[tags0i][tags0j];
                        int temp1 = tags[i][j - 1];
                        int temp2 = tags[i][j - 2];
                        tags[i][j - 1] = temp;
                        tags[i][j - 2] = temp1;
                        tags[tags0i][tags0j] = temp2;
                    }
                    if (j > tags0j && j <= tags0j + 2) {
                        int temp = tags[i][j];
                        int temp1 = tags[i][j - 1];
                        tags[i][j] = tags[tags0i][tags0j];
                        tags[i][j - 1] = temp;
                        tags[tags0i][tags0j] = temp1;

                    }
                    if (tags0j > j && tags0j < j + 3) {
                        int temp = tags[i][j];
                        int temp1 = tags[i][j + 1];
                        tags[i][j] = tags[tags0i][tags0j];
                        tags[i][j + 1] = temp;
                        tags[tags0i][tags0j] = temp1;
                        System.out.println("6");
                        break;
                    }
                    if (tags0i > i && tags0i == i + 1) {
                        int temp = tags[i][j];//1
                        int temp1 = tags[i + 1][j];//9
                        tags[i][j] = tags[tags0i][tags0j];//[0]
                        tags[i + 1][j] = temp;
                        tags[tags0i][tags0j] = temp1;
                        System.out.println("7");
                        a = tags[i][j];
                    }
                    if (tags0i > i && tags0i > i + 2) {
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
                        int temp = tags[i][j];
                        tags[i][j] = tags[tags0i][tags0j];
                        int temp1 = tags[i + 1][j];
                        tags[i + 1][j] = temp;
                        tags[tags0i][tags0j] = temp1;
                        System.out.println("9");
                        a = tags[i][j];
                        break;
                    }
                    if (tags0j > j) {
                        int temp = tags[i][j];
                        int temp1 = tags[i][j + 1];
                        int temp2 = tags[i][j + 2];
                        tags[i][j] = tags[tags0i][tags0j];
                        tags[i][j + 1] = temp;
                        tags[i][j + 2] = temp1;
                        tags[tags0i][tags0j] = temp2;
                        System.out.println("10");
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
    }
}

