package m_jc1_143_23.tasksAssessment.task9;
//Разработать класс Point, реализующий точку в трехмерном пространстве (x; y; z).
//На основании разработанного класса Point создать набор объектов. Для созданного набора объектов реализовать следующие задачи:
//получить точку (объект) с наибольшим значением координаты x;
//создать новый поток чисел типа double. Каждое число является расстоянием от точки до начала координат. Полученный поток вывести на экран;
//cоздать новый поток объектов. В потоке должны быть точки (объекты), расстояние от которых до начала координат более 5;
//отсортировать объекты в порядке убывания по критерию расстоянии от точки до начала координат.
//При решении задачи использовать средства Stream API.


public class Point {
    private double x;
    private double y;
    private double z;
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public double distance() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

