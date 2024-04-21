package m_jc1_143_23.tasksAssessment.task6;


//replaceFirst() - заменяет 1ый элемент на новый любого типа
//replaceLast() - заменяет 2ой элемент на новый любого типа
public class Pair<K, T> {
    private K firstElement;
    private T lastElement;


    public Pair(K firstElement, T lastElement) {
        this.firstElement = firstElement;
        this.lastElement = lastElement;
    }

    public K first() {
        return firstElement;
    }

    public T last() {
        return lastElement;
    }

    public void swap() {
        K temp = firstElement;
        firstElement = (K) lastElement;
        lastElement = (T) temp;
    }

    public void replaceFirst(K newFirstElement) {
        firstElement = newFirstElement;
    }

    public void replaceLast(T newLastElement) {
        lastElement = newLastElement;
    }

    @Override
    public String toString() {
        return "Pair {" +
                "firstElement=" + firstElement +
                ", lastElement=" + lastElement +
                '}';
    }
}
