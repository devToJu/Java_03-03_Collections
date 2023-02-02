import java.util.Iterator;

public class GenericList <E> implements Iterable<E> {
    private final E[] elements = (E[]) new Object[10];
    private int count;

    public void add(E element) {
        this.elements[count++] = element;
    }

    public E getElement(int index) {
        return this.elements[index];
    }

    public int getCount() {
        return count;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
