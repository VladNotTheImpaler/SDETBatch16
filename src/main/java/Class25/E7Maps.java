package Class25;

import java.util.HashMap;

public class E7Maps {
    public static void main(String[] args) {
//      will NOT retain the order
        HashMap<String, Double> grocery = new HashMap<>();
        grocery.put("Apple", 2.5);
        grocery.put("Soap", 3.1);
        grocery.put("Eggs", 3.5);
        grocery.put("Milk", 2.5);
        grocery.put("Apple", 4.5); // data will be overriden
        System.out.println(grocery);
        System.out.println(grocery.size()); // will return the size of the array
        System.out.println(grocery.containsKey("eggs")); // will return boolean value
        System.out.println(grocery.containsValue(3.5)); // boolean
        System.out.println(grocery.isEmpty()); // boolean

    }
}
