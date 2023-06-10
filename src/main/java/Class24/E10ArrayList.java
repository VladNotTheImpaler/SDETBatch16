package Class24;

import java.util.ArrayList;

public class E10ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Coke");  // true
        names.add("coffee"); // true
        names.add("Water"); //false
        names.add("juice"); // true

        names.removeIf(x->x.endsWith("e"));

        /*
          Iterator<String> iterator= names.iterator();
        while (iterator.hasNext()){
            String word=iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }
        }
         */
        System.out.println(names);


    }
}

