package Class24;

import java.util.ArrayList;

public class E9ArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Coke");
        words.add("Coffee");
        words.add("Water");
        words.add("Juice");

        System.out.println(words);

//        enhanced wont work
        /*

        for (String word : words) {
            if (word.endsWith("e")){
                words.remove(word);
            }

        }
        */

//     will not remove coffe because index for coffee will change and
//     at the second iteration will change from 1 to 0 so we have to add i--
//     on line 34

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if(word.endsWith("e")){
                words.remove(i);
                i--;

//                Its not safe to use LOOPS because its indexes shifts.
            }

        }



    }
}
