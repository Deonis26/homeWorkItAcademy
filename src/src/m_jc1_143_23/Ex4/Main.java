package m_jc1_143_23.Ex4;
//Создать класс потока(PlayerGeneratorTask), который генерирует коллекцию из 10 объектов класса
// Player с полями name(String), age(Integer), isActive(boolean) по условию: name – любое, age – от 20
// до 40, isActive – true/false и записывает ее в файл. Поток возвращает имя файла, в который он писал.
//Создать класс потока(PlayerReaderTask), который читает файл и возвращает коллекцию активных Player в
// возрастном диапазоне от 25 до 30.
// Создать пул потоков из 4 штук
// Запустить 20 потоков класса PlayerGeneratorTask.
//Запустить поток класса PlayerReaderTask на каждый выполненный PlayerGeneratorTask.
//Отсортировать по возрасту и вывести на экран имена 5 игроков в UpperCase, удовлетворяющие условию с
// помощью Stream API.

import m_jc1_143_23.Ex3.Car;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ivan", 22, true);
        Player player2 = new Player("Stepan", 23, false);
        Player player3 = new Player("Klar", 25, true);
        Player player4 = new Player("Ivan1", 27, false);
        Player player5 = new Player("Ivan2", 30, true);
        Player player6 = new Player("Ivan3", 35, true);
        Player player7 = new Player("Ivan4", 37, true);
        Player player8 = new Player("Ivan7", 33, false);
        Player player9 = new Player("Ivan8", 27, true);
        Player player10 = new Player("Ivan9", 29, true);
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);
        System.out.println(players);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("player.txt"));
        ) {
            for (Player player  : players) {
                writer.write(player.toString());
                writer.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}