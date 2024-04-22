package m_jc1_143_23.testAssignments.test10;

public class Ball<K,L> {
    private K color;
    private L diametr;

    public Ball(K color, L diametr) {
        this.color = color;
        this.diametr = diametr;
    }

    public K getColor() {
        return color;
    }

    public void setColor(K color) {
        this.color = color;
    }

    public L getDiametr() {
        return diametr;
    }

    public void setDiametr(L diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Ball = {" +
                "color=" + color +
                ", diametr=" + diametr +
                '}';
    }
}
