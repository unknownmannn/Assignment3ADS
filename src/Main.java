import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BST<Integer, String> bst = new BST<>();

        bst.put(20, "20");
        bst.put(10, "10");
        bst.put(30, "30");
        bst.put(5, "5");
        bst.put(15, "15");

        System.out.println("sim 5:" + bst.get(5));

        bst.delete(3);

        System.out.println("sim 5 aft del:" + bst.get(5));

        System.out.println("growing order:");
        for (Integer key : bst) {
            System.out.println(key);
        }

        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(1000);
            MyTestingClass object = new MyTestingClass(id);
            table.put(object, "svalue " + i);
        }
        table.printBucketCounts();
    }
}