package Class25;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Chicago");
        cities.add("New York");
        cities.add("Ft. Lauderdale");
        cities.add("Austin");
        cities.add("Dallas");
        cities.add("Houston");

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}
