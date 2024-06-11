package m_jc1_143_23.tasksAssessment.task6;

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

    public Pair<T, K> swap() {

        return new Pair<>(this.lastElement, this.firstElement);
    }

    public <H> Pair<H, T> replaceFirst(H firstElement) {
        return new Pair<>(firstElement, lastElement);
    }

    public <M> Pair<K, M> replaceLast(M lastElement) {
        return new Pair<>(firstElement, lastElement);
    }

    @Override
    public String toString() {
        return "Pair {" +
                "firstElement=" + firstElement +
                ", lastElement=" + lastElement +
                '}';
    }

}
