package m_jc1_143_23.tasksAssessment.task5;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers;

    public Bouquet() {
        flowers = new ArrayList<>();
    }
    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public double calculatePrice() {
        double totalPrice = 0;
        for (Flower flower : flowers) {
            totalPrice += flower.getPrise();
        }
        return totalPrice;
    }

    public List<String> getFlowerColors() {
        List<String> flowerColors = new ArrayList<>();
        for (Flower flower : flowers) {
            flowerColors.add(flower.getColor());
        }
        return flowerColors;
    }

    public int getDaysToWither() {
        int maxDays = 0;
        for (Flower flower : flowers) {
            if (flower.getTimeWhenFlowerWithers() > maxDays) {
                maxDays = flower.getTimeWhenFlowerWithers();
            }
        }
        return maxDays;
    }

}
