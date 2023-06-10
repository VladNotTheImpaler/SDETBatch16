package Class23;

import java.util.ArrayList;

public class E3Collection {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Moncef");
        names.add("Vlad");
        names.add("Axel");
        names.add("Adam");
        names.add("Marina");
        names.add("Farwa");

        names.remove("Axel");
        names.remove(2);

        System.out.println(names.indexOf("Marina"));
        //names.clear(); will clear all list
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
    }
}
