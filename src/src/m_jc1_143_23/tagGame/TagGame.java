package m_jc1_143_23.tagGame;

import java.util.ArrayList;
import java.util.Collections;

public class TagGame {
    public Integer[][] tagGame;
    Integer size = 4;
    public Integer[][] tagGameRandomize = new Integer[size][size];


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
