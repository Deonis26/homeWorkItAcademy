package m_jc1_143_23.testAssignments.test9;

public class HomeDevice {
    private String name;
    private int power;
    private boolean turnOn;
    private boolean turnOff;

    public HomeDevice(String name, int power, boolean turnOn, boolean turnOff) {
        this.name = name;
        this.power = power;
        this.turnOn = turnOn;
        this.turnOff = turnOff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public boolean isTurnOff() {
        return turnOff;
    }

    public void setTurnOff(boolean turnOff) {
        this.turnOff = turnOff;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", power=" + power +
                ", turnOn=" + turnOn +
                ", turnOff=" + turnOff +
                '.';
    }

    public boolean searchPower(int a) {
        if (a == getPower()) {
            System.out.println(getName());

        }
        return false;
    }
}