package m_jc1_143_23.tasksAssessment.task6;
//Реализовать класс Pair, который будет содержать 2 значения любого типа <K, T>. Класс содержит методы:
//first() - возвращает 1ый элемент
//last() - возвращает 2ой элемент
//swap() - меняет 1ый и 2ой элементы местами
//replaceFirst() - заменяет 1ый элемент на новый любого типа
//replaceLast() - заменяет 2ой элемент на новый любого типа

public class PairMain {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("S1", 11);
        System.out.println(pair);
        Pair<Integer, String> pair1 = pair.swap();
        Integer first = pair1.first();
        System.out.println(pair1);
        System.out.println(pair.first());
        System.out.println(pair.last());
        pair.replaceFirst("String" );
        System.out.println(pair);
    }
}

