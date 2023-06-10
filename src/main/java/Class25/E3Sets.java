package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Farwa");
        names.add("Farwa");
//        there is get method
        System.out.println(names.get(0)); // it will print element with index 0
        System.out.println(names);


        HashSet<String> uniqNames = new HashSet<>();
        // 1. it doesn`t mentain the order!!!
        // 2. it doesn`t allow duplicates
        uniqNames.add("Yellow");
        uniqNames.add("Yellow");
        uniqNames.add("green");
//        There is no get method in sets uniqNames.get(0) because its random
        System.out.println(uniqNames);


    }
}
