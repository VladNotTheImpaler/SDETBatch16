package Class24;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> makeup = new ArrayList<>();
        makeup.add("nailPolish");
        makeup.add("Lipstick");
        makeup.add("Blush");

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");

        ArrayList<String> grocery = new ArrayList<>();
        grocery.addAll(makeup);
        grocery.addAll(fruit);
        System.out.println(grocery);

    }
}
