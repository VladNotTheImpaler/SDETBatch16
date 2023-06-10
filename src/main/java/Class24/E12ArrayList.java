package Class24;

import java.util.ArrayList;

public class E12ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("smoothie");
        drinks.add("ginger ale");
        drinks.add("chai");
        drinks.add("milk");
        drinks.replaceAll(a -> a.contains("a") || a.contains("e")? "water" :a);
        System.out.println(drinks);

        /*
        for (int i = 0; i < drinks.size(); i++) {


            String word = drinks.get(i);
            if(word.contains("e") || word.contains("a")){}
            drinks.set(i,"Water");
        }
        */



        
    }
}
