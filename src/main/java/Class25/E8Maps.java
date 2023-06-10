package Class25;

import java.util.LinkedHashMap;

public class E8Maps {
    public static void main(String[] args) {
//mentains the order
        LinkedHashMap<Integer, String> ranks = new LinkedHashMap<>();
        ranks.put(1, "James");
        ranks.put(2, "Adam");
        ranks.put(3, "John");
        ranks.put(4, "Jimmy");
        System.out.println(ranks);
        ranks.remove(2);
        System.out.println(ranks);
        ranks.replace(1, "Adam"); // Will replaces James with Adam
        System.out.println(ranks);
    }
}
