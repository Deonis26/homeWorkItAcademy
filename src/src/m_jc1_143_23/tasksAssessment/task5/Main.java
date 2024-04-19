package m_jc1_143_23.tasksAssessment.task5;

//Реализовать иерархию цветов (розы, гвоздики, тюльпаны, лилии и... что-то на свой вкус).
//Создать несколько объектов-цветов.
//Собрать букет и определить его стоимость.
//Определить все цвета, используемые в букете.
//Определить когда весь букет завянет.
//В букет может входить несколько цветов одного типа.
public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Rose("red", 15,5));
        bouquet.addFlower(new Chamomile("white",4,7));
        bouquet.addFlower(new Tulip("yellow", 3,1));
        bouquet.addFlower(new Lulac("white", 44, 6));
        System.out.println("Стоимость букета: "+bouquet.calculatePrice());
        System.out.println("Цвета в букете: "+bouquet.getFlowerColors());
        System.out.println("День, когда цветы завянут: "+bouquet.getDaysToWither());
    }
}
