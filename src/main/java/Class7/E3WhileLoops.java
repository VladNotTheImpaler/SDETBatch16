package Class7;

public class E3WhileLoops {
    public static void main(String[] args) {
        // we want to print "Hello World " 5 times on the console with while loop

        int counter=1;
        while (counter<=5){
            System.out.println("Hello world");

            counter++; // will increase as many times until condition is met.
            counter=counter+2; // will increase 2 times
        }
    }
}
