package m_jc1_143_23.tasksAssessment.task6;
//Реализовать класс Pair, который будет содержать 2 значения любого типа <K, T>. Класс содержит методы:
//first() - возвращает 1ый элемент
//last() - возвращает 2ой элемент
//swap() - меняет 1ый и 2ой элементы местами
//replaceFirst() - заменяет 1ый элемент на новый любого типа
//replaceLast() - заменяет 2ой элемент на новый любого типа

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(22, "ss");
        pair1.swap();
        System.out.println(pair1);
        pair1.swap();
        System.out.println(pair1);
        pair1.replaceFirst(222);
        System.out.println(pair1);
        pair1.replaceLast("111111");
        System.out.println(pair1);
        System.out.println(pair1.first());
        System.out.println(pair1.last());

    }
}
