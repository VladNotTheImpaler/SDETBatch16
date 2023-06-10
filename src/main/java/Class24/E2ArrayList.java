package Class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(100);
        numbers.add(200);
        System.out.println(numbers);
        System.out.println("*********************");
//      enhanced loop
        for (Integer num : numbers) {
            System.out.println(num);
        }
        System.out.println("*********************");
//      fori loop to get the same output
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.indexOf(i));
        }
        System.out.println("*********************");
//        while loop
        int i = 0;
        while (i < numbers.size()) {
            System.out.println(numbers.get(i));
            i++;
        }
        System.out.println("*********************");
//        do while loop
        int j = 0;
        do{
            System.out.println(numbers.get(j));
            j++;
        }while (j<numbers.size());
    }

}
