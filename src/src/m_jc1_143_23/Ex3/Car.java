package m_jc1_143_23.Ex3;

public class Car{
    private String name;
    private int engineСapacity;
    private CarModel carModel;
    public Car(String name, int engineСapacity, CarModel carModel){
        this.name=name;
        this.engineСapacity=engineСapacity;
        this.carModel=carModel;
    }
    @Override
    public String toString() {
        return "<"+name +"> : <" +carModel+"> :"+ engineСapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEngineСapacity()   {
        return engineСapacity;
    }

    public void setEngineСapacity(int engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }
}
