package m_jc1_143_23.testAssignments.test10;

//Реализуйте свой собственный стек (очередь) со стандартными функциями push() и pop(),
//а так же с дополнительной функцией max() за O(1)
public class MainStack {
    public static void main(String[] args) {
        StackMax stack = new StackMax();

        stack.push(190);
        stack.push(44);
        stack.push(7);
        stack.push(191);
        /*s1.push(15);
        s1.push(122);
        s1.push(-1);
        s1.push(222);
        s1.push(2);
        s1.push(8);
        s1.push(144);
        s1.push(150);
        s1.push(151);*/
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.max());
        System.out.println(stack.pop());
    }
}
