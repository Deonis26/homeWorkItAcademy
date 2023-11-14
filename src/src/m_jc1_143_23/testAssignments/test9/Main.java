package m_jc1_143_23.testAssignments.test9;

import java.util.Arrays;
import java.util.TreeSet;

/*Определить иерархию домашней техники. Включить некоторые в розетку turnOn = true.
        Посчитать текущую потребляемую мощность.
        Провести сортировку приборов в квартире на основе одного из параметров.
        Найти кухонный прибор в квартире, соответствующий заданному диапазону параметров. */
public class Main {
    public static void main(String[] args) {
        int sumPower = 0;
        RoomDevice pc = new RoomDevice("Стационарный ПК", 500, false, true, "Выполнение работы с файлами");
        KitchenDevice fridge = new KitchenDevice("Холодильник", 750, false, true, "Морозит еду");
        KitchenDevice microwave = new KitchenDevice("Микроволновка", 1500, false, false, "Подогревает еду");
        KitchenDevice machineWashing = new KitchenDevice("Стиральная машина", 3500, false, false, "Стирает вещи");
        KitchenDevice kettle = new KitchenDevice("Чайник", 150, false, false, "Подогревает воду");
        KitchenDevice electricStove = new KitchenDevice("Электрическая плита", 1000, false, false, "Подогревает еду");
        KitchenDevice hoodsKitchen = new KitchenDevice("Кухонная вытяжка", 200, false, false, "Вытягивает пар");
        RoomDevice tv = new RoomDevice("Телевизор", 500, false, false, "Просмотр телепередач");
        RoomDevice lamp = new RoomDevice("Лампа", 100, false, false, "Освещает комнату");
        RoomDevice tapeRecording = new RoomDevice("Магнитофон", 200, false, false, "Прослушивание музыки");
        RoomDevice sewingMachine = new RoomDevice("Швейная машинка", 300, false, false, "шитье одежды");
        sewingMachine.setTurnOn(true);
        fridge.setTurnOn(true);
        lamp.setTurnOn(true);
        HomeDevice[] homeDevices = {pc, fridge, machineWashing, kettle, electricStove, hoodsKitchen, tv, lamp, tapeRecording, sewingMachine, microwave};

        for (HomeDevice positions : homeDevices) {
            if (positions.isTurnOn()) {
                sumPower = sumPower + positions.getPower();
            }
        }
        System.out.println("Максимальная потребляемая мощность потребителей: " + sumPower + " кВт/ч");
        System.out.println();
        for (int i = 0; i < homeDevices.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < homeDevices.length; j++) {
                if (homeDevices[j].getPower() < homeDevices[minPos].getPower()) {
                    minPos = j;
                }
            }
            HomeDevice temp = homeDevices[minPos];
            homeDevices[minPos] = homeDevices[i];
            homeDevices[i] = temp;
        }
        for (HomeDevice positions : homeDevices) {
            System.out.println(positions);
        }
        System.out.println();

        System.out.println();
        for (HomeDevice positions : homeDevices) {
            if (positions.searchPower(200)) {
                System.out.println(positions.getName());
            }
        }
        System.out.println();
        SortingElements sortingElements = new SortingElements();
        TreeSet<HomeDevice> homeDevice = new TreeSet<>(sortingElements);
        homeDevice.add(pc);
        homeDevice.add(fridge);
        homeDevice.add(machineWashing);
        homeDevice.add(kettle);
        homeDevice.add(electricStove);
        homeDevice.add(hoodsKitchen);
        homeDevice.add(tv);
        homeDevice.add(lamp);
        homeDevice.add(tapeRecording);
        homeDevice.add(sewingMachine);
        homeDevice.add(microwave);
        int i=0;
        System.out.println("Сортировка через Comparator");
        for (HomeDevice p: homeDevices){
            i++;
            System.out.println(i+". "+p.getName()+" - "+p.getPower());
        }

    }
}






