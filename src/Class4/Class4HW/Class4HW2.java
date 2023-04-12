package Class4.Class4HW;

import javax.swing.*;
import java.util.Scanner;

public class Class4HW2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Loan amount");

        int loanAmount = scanner.nextInt();

        if (loanAmount <= 200000) {
            System.out.println("Loan Amount Approved");
        } else {
            System.out.println("Sorry, Loan Amount was NOT Approved ");
        }
    }
}

