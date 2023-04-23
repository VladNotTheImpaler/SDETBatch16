package HW.Project1;

public class Task5 {
    public static void main(String[] args) {
        int num1=85;
        int num2=60;
        System.out.println("Before swap, first is "+num1+" and second is "+num2 );
        num1=num1-num2;
        num2=num1+num2;
        num1=num2-num1;
        System.out.println("After swap, first is "+num1+" and second is "+num2 );
    }
}