package m_jc1_143_23;

//Сгенерировать три произвольных целых числа X, Y и Z.
//Если X больше Z, то вывести на экран сумму X и Y, иначе вывести на экран значение Z.
//Вывести на экран среднее арифметическое этих чисел.
public class Ex1 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        int z = (int) (Math.random() * 10);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        double sredArifm=(double) (x+y+z)/3;

        System.out.println("среднеарифметическое значение: "+sredArifm);
        if (x > z) {
            System.out.println(x + y);
        } else {
            System.out.println(z);
        }
    }

}
