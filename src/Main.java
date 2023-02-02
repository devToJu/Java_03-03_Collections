public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        // Will throw NullPointerException because of missing implementation of the iterator()-Method
        var iterator = list.iterator();
        while(iterator.hasNext()) {
            var item = iterator.next();
            System.out.println(item);
        }
    }
}