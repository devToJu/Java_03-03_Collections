import java.util.Iterator;

public class GenericList <E> implements Iterable<E> {
    private final E[] elements = (E[]) new Object[10];
    private int count;

    public void add(E element) {
        this.elements[count++] = element;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < count;
        }

        @Override
        public E next() {
            return elements[index++];
        }
    }
}
