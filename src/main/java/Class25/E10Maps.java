package Class25;

import java.util.Set;
import java.util.TreeMap;

public class E10Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();

        makeup.put("Lipstick", 100.0);
        makeup.put("BlushOn", 68.0);
        makeup.put("EyeLiner", 80.0);
        makeup.put("Foundation", 120.0);
        makeup.put("Base", 25.0);

        Set<String> keyes = makeup.keySet();
        keyes.removeIf(x-> x.contains("a"));
        System.out.println(makeup);
    }
}
