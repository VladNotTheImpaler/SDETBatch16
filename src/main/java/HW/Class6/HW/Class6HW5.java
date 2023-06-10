package HW.Class6.HW;

import java.util.Scanner;

public class Class6HW5 {
    public static void main(String[] args) {

        /*
        Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quiz score: ");
        double quizScore = scanner.nextDouble();
        System.out.print("Enter the mid-term score: ");
        double midTermScore = scanner.nextDouble();
        System.out.print("Enter the final score: ");
        double finalScore = scanner.nextDouble();

        double averageScore = (quizScore + midTermScore + finalScore) / 3.0;
        char grade;

        if (averageScore >= 90.0) {
            grade = 'A';
        } else if (averageScore >= 70.0 && averageScore < 90.0) {
            grade = 'B';
        } else if (averageScore >= 50.0 && averageScore < 70.0) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Your average score is " + averageScore + " and your grade is " + grade + ".");
    }
}

