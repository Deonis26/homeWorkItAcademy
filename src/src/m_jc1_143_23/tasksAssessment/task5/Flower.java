package m_jc1_143_23.tasksAssessment.task5;

public class Flower {
    private String name;
    private String color;
    private int prise;
    private int timeWhenFlowerWithers;

    public Flower(String name, String color, int prise, int timeWhenFlowerWithers) {
        this.name = name;
        this.color = color;
        this.prise = prise;
        this.timeWhenFlowerWithers = timeWhenFlowerWithers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", prise=" + prise +
                ", timeWhenFlowerWithers=" + timeWhenFlowerWithers +
                '}';
    }
}
