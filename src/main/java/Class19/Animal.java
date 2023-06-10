package Class19;

        // create 3 classes like Dog, Cat, Horse. Define 5 properties(use default access level)
        // you can use inheritance to avoid code duplication.
        // Create one printInfo method that will print the values of these variables.
        // create constructors as well in each child class to initialize those
        // properties create one object of each class and call the printInfo method
public class Animal {
    //avoiding code duplication by creating properties, method and constructor in parent class
           private String name;
           private String color;
           private String breed;
           private int age;
           private double weight;
// creating a method
            void printInfo(){
                System.out.println(name+" "+color+" "+breed+" "+age+" "+weight);
            }
//creating a constructor
            public Animal(String name, String color, String breed, int age, double weight) {
                this.name = name;
                this.color = color;
                this.breed = breed;
                this.age = age;
                this.weight = weight;
            }
        }

class Dog extends Animal{
    // initializing another field
    double price;
    public Dog(String name, String color, String breed, int age, double weight, double price) {
        super(name, color, breed, age, weight);
        this.price=price; // assigning the price
    }
    void printInfo(){
        super.printInfo(); // calling printInfo method from parent class
        System.out.print(price); // will print price field we declared in Dog class on a new line
    }
}
class Cat extends Animal{

    public Cat(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}
class Horse extends Animal{

    public Horse(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}

class AnimalTester{
    public static void main(String[] args) {

    Dog dog=new Dog("Tom","Black", "persian", 10,20, 2000);
    dog.printInfo(); // will print printInfo method + line 38

    }
}