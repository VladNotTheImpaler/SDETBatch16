package Class18;

public class AnimalTester {
    /*
    create 2 classes of different animals like Cat,Dog ,Zebra,Camel,Horse etc
    in each class create 5 fields and 3 methods.
     */
    public static void main(String[] args) {

        Horse horse=new Horse();
        horse.color="Black";
        System.out.println( horse.color="Black");
        horse.eat();

        Cat cat=new Cat();
        cat.name="Mano";
        cat.sleep();
        cat.eat();
        cat.speak();
    }
}
