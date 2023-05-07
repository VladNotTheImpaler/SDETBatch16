package HW.Class14HW;

import java.util.Scanner;

public class Student {
    /*
    Create  class Student that will have a method getGrade.
    Your method should accept the score of a student and return a grade:
    score > 90 - A
    score >80 - B
    score >70 - C
    score > 50 - D
    anything else - F
     */
    void getGrades(int grades) {
        if (grades >= 90) {
            System.out.println("A");
        } else if (grades >= 80 && grades < 90) {
            System.out.println("B");
        }else if (grades>=70 && grades<80){
            System.out.println("C");
        } else if (grades>=50 && grades<70) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }

    }
    public static void main(String[] args) {
        Student grade=new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score 0 to 100: ");
        int takenGrade = scanner.nextInt();



    }
}