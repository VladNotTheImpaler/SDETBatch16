package Class6;

public class E1LogicalOperators {
    public static void main(String[] args) {
        boolean chocolates = true;
        boolean flowers = true;
        if (chocolates) {
            System.out.println("I am happy");
        } else {
            System.out.println("I am sad");
        }

        boolean fiveG = true;
        boolean wifi = false;

        if (wifi || fiveG) {
            System.out.println("You can browse the internet");

        }
    }
}
