package HW.Class14HW;

import Class6.Task;

import java.util.Scanner;

public class Task1 {
    /*
    Create a method that will say Hello in different language based on the country
    that will be passed when method is executed.
     */

    void greeting(String country){
        if (country.equalsIgnoreCase("USA")){
            System.out.println("Hello");
        } else if(country.equalsIgnoreCase("Italy")){
            System.out.println("Ciao");
        }else if(country.equalsIgnoreCase("Germany")) {
            System.out.println("Gutten Tag");
        }else if(country.equalsIgnoreCase("France")) {
            System.out.println("Bonjour");
        }else if(country.equalsIgnoreCase("Spain")) {
            System.out.println("Holla");
        }else if(country.equalsIgnoreCase("Moldova")) {
            System.out.println("Salut");
        }else if(country.equalsIgnoreCase("Japan")) {
            System.out.println("Konnichiwa");
        }else if(country.equalsIgnoreCase("China")) {
            System.out.println("Ni hao");
        }else{
            System.out.println("I`ll have learn more greetings");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What will be the country you want to see the greeting in?");
        String sayHello = scanner.nextLine();
        Task1 greetings = new Task1();
        greetings.greeting(sayHello);
    }
}
