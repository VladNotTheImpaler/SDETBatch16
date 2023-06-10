package Class21;

class Animal{
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }

    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep from 1 to 20 hours a day");
    }
    void eat(){
        System.out.println("Animals eat many different things ");
    }
}
class Cat extends Animal{

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Meow meow.....");
    }
    @Override
    void eat(){
        System.out.println("Cats like to eat Fish");
    }

    @Override
    void sleep() {
        System.out.println("Cats like to sleep 15 hours on Average");
    }
}
public class Dog extends Animal{


    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("woof woof");
    }

    @Override
    void sleep() {
        System.out.println("Dogs sleep 8 hours");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to chew the bones");
    }
    void run() {
        System.out.println("Dogs like to chew the bones");
    }
}

class Horse extends Animal{

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("neigh neigh");
    }

    @Override
    void eat() {
        System.out.println("Horses like Carrots+ Grass");
    }

    @Override
    void sleep() {
        System.out.println("Horses sleep 2-3 hours");
    }
}

class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("shaggy","black","German");
        dog.printInfo();
        //Parent class variables can store the objects of the child classes
        Animal dog1=new Dog("shaggy","black","German");
        dog1.printInfo();
        // 11:54
        Animal [] animals={new Dog("shaggy","black","German"),new Cat("Tom","Blue","persian")};

        for(Animal animal:animals){
            animal.printInfo();
        }
/*
        //type casting(widening) up casting
        double d=10;
        Animal dog2=new Dog("shaggy","black","German");

        //typecasting(narrowing) down casting
        int g = (int)10.5; // example --> we can upcast primitive data type
        // Animal dog=new Dog("shaggy","black","German"); --> will give an error --> not allowed
*/
    }
}