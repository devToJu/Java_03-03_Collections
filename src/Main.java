public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i < list.getCount(); i++) {
            System.out.println(list.getElement(i));
        }
    }
}