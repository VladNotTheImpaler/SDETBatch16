package Class25;

import java.util.TreeSet;

public class E5Sets {
    public static void main(String[] args) {

//        it will sort alphabetical order and no duplicates
        TreeSet<String> fruit = new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
    }
}
