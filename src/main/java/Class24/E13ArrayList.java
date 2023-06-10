package Class24;

import java.util.ArrayList;

//Create an arrayList of drinks call it. If any drink has letter “a” or “e” replace it with water
public class E13ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Coke");
        names.add("milk");
        names.add("Water");
        names.add("juice");

     /*   for (int i = 0; i < names.size(); i++) {
            String word=names.get(i);
            if(word.contains("e")||word.contains("a")){
                names.set(i,"Water");
            }
        }*/

       /* names.replaceAll(x-> {
            if(x.contains("a")||x.contains("e")){
                return "Water";
            }else {
                return x;
            }
        });*/

        names.replaceAll(x-> x.contains("a")||x.contains("e")?"water":x);
        System.out.println(names);
    }
}
