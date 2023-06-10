package Class24;

import java.util.ArrayList;

public class E8ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Marin");
        names.add("Vlad");
        names.add("Zak");
        names.add("Alina");
        names.add("Axel");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Alina"));
        System.out.println(names.size());
    }
}
