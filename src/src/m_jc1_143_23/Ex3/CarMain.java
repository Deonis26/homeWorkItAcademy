package m_jc1_143_23.Ex3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Сгенерировать 10 объектов класса Car у которых характеристики name(String),
//carModel (Enum с тремя объектами-значениями), engineСapacity(int в диапазоне 1-3).
//Сгруппировать их по engineCapacity используя Map<Integer, List<Car>>
//Для произвольного значения engineCapacity записать в файл соответствующий список объектов в формате:
//<name> : <carModel> : engineСapacity
//<name> : <carModel> : engineСapacity
public class CarMain {
    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("name1", 3, CarModel.Ferrari);
        Car car2 = new Car("name2", 2, CarModel.Ford);
        Car car3 = new Car("name3", 3, CarModel.Ferrari);
        Car car4 = new Car("name4", 2, CarModel.Suzuki);
        Car car5 = new Car("name5", 3, CarModel.Ferrari);
        Car car6 = new Car("name6", 1, CarModel.Ferrari);
        Car car7 = new Car("name7", 3, CarModel.Suzuki);
        Car car8 = new Car("name8", 1, CarModel.Ferrari);
        Car car9 = new Car("name9", 2, CarModel.Ferrari);
        Car car10 = new Car("name10", 3, CarModel.Ferrari);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        //System.out.println(cars);
        Map<Integer, List<Car>> groupCar = new HashMap<>();
        for (Car car : cars) {
            if (groupCar.containsKey(car.getEngineСapacity())) {
                groupCar.get(car.getEngineСapacity()).add(car);
            } else {
                List<Car> list = new ArrayList<>();
                list.add(car);
                groupCar.put(car.getEngineСapacity(), list);
            }
        }
        System.out.println(groupCar);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("car.txt"));
        ) {
            for (Car car : groupCar.get(1)) {
                writer.write(car.toString());
                writer.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
