package HW.Class4.HW;

import java.util.Scanner;

public class Class4HW4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your city");
        String city = scanner.next();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please Enter outside temperature in Fahrenheit ");

        int temperature = scanner1.nextInt();
        double convertedTempToCelsius = (temperature - 32) * 0.556;
        int celsiusTemp = (int) convertedTempToCelsius;

        System.out.println("Outside is " + celsiusTemp + " °C");

    }
}
