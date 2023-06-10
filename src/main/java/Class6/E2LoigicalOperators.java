package Class6;

public class E2LoigicalOperators {
    public static void main(String[] args) {

        int age = 17;
        boolean flag = age > 1; // combining int with >1 to be true

        double marksInMath = 92;
        double marksInScience = 95;

        if (marksInMath > 90 && marksInScience > 90) {
            System.out.println("You are brilliant student");
        } else {
            System.out.println("You need to work hard");
        }
    }
}
