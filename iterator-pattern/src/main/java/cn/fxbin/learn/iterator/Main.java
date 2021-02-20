package cn.fxbin.learn.iterator;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 17:06
 */
public class Main {

    public static void main(String[] args) {
        ICollection collection = new MyCollection();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("D");
        collection.add("E");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

}
