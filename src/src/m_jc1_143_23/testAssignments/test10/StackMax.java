package m_jc1_143_23.testAssignments.test10;

import java.util.Stack;

public class StackMax extends Stack {
    public int minValue=Integer.MAX_VALUE;
    public void push(int E){
        if (minValue>E){
            minValue=E;
        }
        addElement(E);
    }
    public int min(){
        return minValue;
    }

}
