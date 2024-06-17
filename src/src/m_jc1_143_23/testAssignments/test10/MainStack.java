package m_jc1_143_23.testAssignments.test10;

//Реализуйте свой собственный стек (очередь) со стандартными функциями push() и pop(),
//а так же с дополнительной функцией max() за O(1)
public class MainStack {
    public static void main(String[] args) {
        StackMax s1 = new StackMax();
        s1.push(44);
        s1.push(7);
        s1.push(-10);
        s1.push(15);
        s1.push(122);
        s1.push(-1);
        s1.push(2);
        s1.push(8);
        s1.push(144);
        s1.push(150);
        System.out.println(s1);
        System.out.println(s1.max());
    }
}
