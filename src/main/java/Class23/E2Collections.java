package Class23;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("Moncef");
        names.add("Vlad");
        names.add("Axel");
        names.add("Adam");
        names.add("Marina");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Vlad"));
        System.out.println(names.contains("Sarah"));
        System.out.println(names.get(0));
        names.remove("Vlad");
        System.out.println(names);

    }
}
