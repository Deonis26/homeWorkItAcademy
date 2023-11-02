package m_jc1_143_23.testAssignments.test9;

public class KitchenDevice extends HomeDevice {
    private String function;


    public KitchenDevice(String name, int power, boolean turnOn, boolean turnOff, String function) {
        super(name, power, turnOn, turnOff);

        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public String getName(String name) {
        return name;
    }



    public int getPower(int power) {
        return power;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return getName() + ". " +
                " Мощность - " + getPower() + " кВт.";
    }

}
