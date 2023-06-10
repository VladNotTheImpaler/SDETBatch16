package Class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {


    public static void main(String[] args) {
        Map<Integer, String> item = new LinkedHashMap<>();
        item.put(123,"Printer");
        item.put(124,"Scanner");
        item.put(125,"Tv");
        item.put(126,"Computer");
        item.put(127,"Phone");
        item.put(128,"Toaster");

        for (var i : item.entrySet()) {
            System.out.println(i);

        }

    }
}
