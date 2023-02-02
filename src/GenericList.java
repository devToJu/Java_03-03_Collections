public class GenericList <E> {
    private final E[] list = (E[]) new Object[10];
    private int count;

    public void add(E element) {
        this.list[count++] = element;
    }

    public E getElement(int index) {
        return this.list[index];
    }
}
