package m_jc1_143_23.testAssignments.test10;

import java.util.Stack;

public class StackMax extends Stack {
    public int maxValue=Integer.MIN_VALUE;
    public void push(int E){
        if (maxValue<E){
            maxValue=E;
        }
        addElement(E);
    }
    public int max(){
        return maxValue;
    }

}
