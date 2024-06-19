package m_jc1_143_23.Ex4;
public class Player {
    private String name;
    private int age;
    private  boolean isActive;
    public Player(String name, int age, boolean isActive){
        this.name=name;
        this.age=age;
        this.isActive=isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
}
