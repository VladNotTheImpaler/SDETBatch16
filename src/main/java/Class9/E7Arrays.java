package Class9;

public class E7Arrays {
    public static void main(String[] args) {
        boolean[] flags={true,false,true,false,false,true};
        // write a loop to count how many times

        int counter=0;
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) // or flags[i]==false
            counter++;

        }
        System.out.println(counter);
    }
}
