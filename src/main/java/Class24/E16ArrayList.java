package Class24;

import java.util.ArrayList;
import java.util.List;

public class E16ArrayList {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
