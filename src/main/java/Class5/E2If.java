package Class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
        //Below code helps us get any type of data from the console
        Scanner input = new Scanner(System.in);
        // print the text inside the "" in the console
        System.out.println("Is it time for break? TRUE or FALSE");
        /*boolean isBreak => we are creating a variable of type boolean
        and calling it isBreak
        input => is also a variable of type scanner
        nextBoolean() => this is a method that helps us take boolean type data
        from the keyboard
        = => to sign will store that value inside the isBreak variable
         */
        boolean isBreak = input.nextBoolean();
        //if(isBreak)
        if (isBreak) { //True or False
            System.out.println("Let`s have a break");
        } else {
            System.out.println("Lets continue the class");
        }
    }
}
