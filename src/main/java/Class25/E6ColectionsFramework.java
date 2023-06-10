package Class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class E6ColectionsFramework {

    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Orange");

        HashSet<String> hashSet = new HashSet<>(fruit);
        System.out.println(hashSet);

        LinkedList<String> linkedList = new LinkedList<>(fruit);
        System.out.println(linkedList);
    }
}
