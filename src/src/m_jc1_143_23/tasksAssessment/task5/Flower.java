package m_jc1_143_23.tasksAssessment.task5;

public class Flower {

    private String color;
    private int prise;
    private int timeWhenFlowerWithers;

    public Flower(String color, int prise, int timeWhenFlowerWithers) {

        this.color = color;
        this.prise = prise;
        this.timeWhenFlowerWithers = timeWhenFlowerWithers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getTimeWhenFlowerWithers() {
        return timeWhenFlowerWithers;
    }

    public void setTimeWhenFlowerWithers(int timeWhenFlowerWithers) {
        this.timeWhenFlowerWithers = timeWhenFlowerWithers;
    }

    @Override
    public String toString() {
        return "Flower: " +
                "color='" + color + '\'' +
                ", prise=" + prise +
                ", timeWhenFlowerWithers=" + timeWhenFlowerWithers +
                '}';
    }
}
