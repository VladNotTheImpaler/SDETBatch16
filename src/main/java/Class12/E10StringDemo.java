package Class12;

public class E10StringDemo {
    public static void main(String[] args) {

        String name = "LEANDROR";
        // System.out.println(name.charAt(1)); to print 1 character
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'R') { // .equals is for non primitives, so we use ==
                count++;
            }
        }
        System.out.println(count);


    }

}
