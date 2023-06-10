package Class26;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("US", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Pakistan", "Islamabad");
        countries.put("Moldova", "Chisinau");
        countries.put("Ukraine", "Kiev");
        countries.put("Russia", "Moscow");


        //   for (Map.Entry<String, String> s : countries.entrySet()) {
        //       System.out.println(s);


        //      Set<String> countrySet = countries.keySet();
        System.out.println("****************Keys*****************");
        for (String s : countries.keySet()) {
            System.out.println(s);
        }
        System.out.println("*************values*************");
        for (String v : countries.values()) {
            System.out.println(v);

        }
        System.out.println("***************Keyes&Values**************");
        for (var e : countries.entrySet()) {
            System.out.println(e);

        }
    }
}
