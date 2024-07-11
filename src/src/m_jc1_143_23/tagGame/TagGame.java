package m_jc1_143_23.tagGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TagGame {
    public Integer[][] tagGame;
    Integer size = 4;
    boolean win = false;

    public TagGame() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 15; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);                                   //метод, который перетусовывает значение в массиве
        this.tagGame = new Integer[size][size];
        int count = 0;
        for (int i = 0; i < tagGame.length; i++) {
            for (int j = 0; j < tagGame[i].length; j++) {
                tagGame[i][j] = numbers.get(count);
                count++;
            }
        }
    }

    public void win() {
        int i;
        int j;
        int tags0i = 0;
        int tags0j = 0;
        int temp5i = 0;
        int temp5j = 0;

        System.out.print("Введите номер пятнашнки от 1 до 15: ");

        while (!win) {
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            int a;
            for (; ; ) {
                try {
                    a = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    scanner.next();
                    System.out.println("Не удалось распознать цифру. Повторите ввод");
                }
            }
            for (i = 0; i < tagGame.length; i++) {
                for (j = 0; j < tagGame.length; j++) {
                    if (a == tagGame[i][j] && (i == tags0i || j == tags0j)) {
                        if (i + 1 == tags0i || j + 1 == tags0j || tags0i + 1 == i || tags0j + 1 == j || tags0i - 1 == i) {
                            int temp = tagGame[i][j];
                            tagGame[i][j] = tagGame[tags0i][tags0j];
                            tagGame[tags0i][tags0j] = temp;
                            temp5i = i;
                            temp5j = j;
                            continue;
                        }
                        if (i > tags0i + 2) {
                            int temp = tagGame[i][j];
                            tagGame[i][j] = tagGame[tags0i][tags0j];
                            int temp1 = tagGame[i - 1][j];
                            int temp2 = tagGame[i - 2][j];
                            tagGame[i - 1][j] = temp;
                            tagGame[i - 2][j] = temp1;
                            tagGame[tags0i][tags0j] = temp2;
                            temp5i = i;
                            temp5j = j;
                        }
                        if (i > tags0i + 1 && i <= tags0i + 2) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tagGame[i][j];
                            int temp1 = tagGame[i - 1][j];
                            tagGame[i][j] = tagGame[tags0i][tags0j];
                            tagGame[i - 1][j] = temp;
                            tagGame[tags0i][tags0j] = temp1;
                        }
                        if (j > tags0j + 2) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tagGame[i][j];
                            tagGame[i][j] = tagGame[tags0i][tags0j];
                            int temp1 = tagGame[i][j - 1];
                            int temp2 = tagGame[i][j - 2];
                            tagGame[i][j - 1] = temp;
                            tagGame[i][j - 2] = temp1;
                            tagGame[tags0i][tags0j] = temp2;
                        }
                        if (j > tags0j && j <= tags0j + 2) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tagGame[i][j];
                            int temp1 = tagGame[i][j - 1];
                            tagGame[i][j] = tagGame[tags0i][tags0j];
                            tagGame[i][j - 1] = temp;
                            tagGame[tags0i][tags0j] = temp1;

                        }
                        if (tags0j > j && tags0j < j + 3) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tagGame[i][j];
                            int temp1 = tagGame[i][j + 1];
                            tagGame[i][j] = tagGame[tags0i][tags0j];
                            tagGame[i][j + 1] = temp;
                            tagGame[tags0i][tags0j] = temp1;
                            break;
                        }
                        if (tags0i > i && tags0i == i + 1) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tagGame[i][j];//1
                            int temp1 = tagGame[i + 1][j];//9
                            tagGame[i][j] = tagGame[tags0i][tags0j];//[0]
                            tagGame[i + 1][j] = temp;
                            tagGame[tags0i][tags0j] = temp1;
                            a = tagGame[i][j];
                        }
                        if (tags0i > i && tags0i > i + 2) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tagGame[i][j];
                            tagGame[i][j] = tagGame[tags0i][tags0j];
                            int temp1 = tagGame[i + 1][j];
                            int temp2 = tagGame[i + 2][j];
                            tagGame[i + 1][j] = temp;
                            tagGame[i + 2][j] = temp1;
                            tagGame[tags0i][tags0j] = temp2;
                            a = tagGame[i][j];
                            break;
                        }
                        if (tags0i > i && tags0i > i + 1) {
                            temp5i = i;
                            temp5j = j;
                            int temp = tagGame[i][j];
                            tagGame[i][j] = tagGame[tags0i][tags0j];
                            int temp1 = tagGame[i + 1][j];
                            tagGame[i + 1][j] = temp;
                            tagGame[tags0i][tags0j] = temp1;
                            a = tagGame[i][j];
                            break;
                        }
                        if (tags0j > j) {
                            int temp = tagGame[i][j];
                            int temp1 = tagGame[i][j + 1];
                            int temp2 = tagGame[i][j + 2];
                            temp5i = i;
                            temp5j = j;
                            tagGame[i][j] = tagGame[tags0i][tags0j];
                            tagGame[i][j + 1] = temp;
                            tagGame[i][j + 2] = temp1;
                            tagGame[tags0i][tags0j] = temp2;
                            break;
                        }
                    }
                }
            }
            for (int k = 0; k < tagGame.length; k++) {
                for (int l = 0; l < tagGame[k].length; l++) {
                    if (tagGame[k][l] == 0) {
                        System.out.print("[ ] ");
                        continue;
                    }
                    System.out.print(tagGame[k][l] + " ");
                }
                System.out.println();
            }
            String massive1 = "";
            for (int k = 0; k < tagGame.length; k++) {
                for (int l = 0; l < tagGame[k].length; l++) {
                    massive1 = massive1 + tagGame[k][l] + " ";
                }
            }
            if (tagGame.equals(massive1)) {
                win = true;
                System.out.println("Победа!! ");
                break;
            } else {
                tags0i = temp5i;
                tags0j = temp5j;
                System.out.println();
                System.out.print("Ваш ход: ");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder massive = new StringBuilder();
        for (Integer[] row : tagGame) {
            for (Integer num : row) {
                if (num == 0) {
                    massive.append("[ ]").append(" ");
                } else {
                    massive.append(num).append(" ");

                }
            }
            massive.append("\n");
        }
        return massive.toString();
    }
}
