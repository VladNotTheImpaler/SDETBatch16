package Class26;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {

    public static void main(String[] args) {
        Map<String, Double> drinks = new HashMap<>();

//        Store the names of the students in java
        drinks.put("Coke", 2.0);
        drinks.put("Milk", 5.0);
        drinks.put("Coffee", 3.0);
        drinks.put("Tea", 3.5);

        drinks.keySet().removeIf(x->x.contains("i"));

    }
}
