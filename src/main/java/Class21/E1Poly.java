package Class21;

public class E1Poly {
    public static void main(String[] args) {
        //short way

        Animal[] animals = { // storing objects in an array
                new Dog("Kantoor","Black", "German"),
                new Cat("Kali","Black","Asian"),
                new Horse("Bravo", "Brown", "American")
        };
        //creating a enhanced loop to go through all array objects
        for (Animal animal : animals) {
            animal.speak();
            animal.eat();
            animal.sleep();
        }
        Animal dogClassStoredinAnimal =  new Dog("Kantoor","Black", "German");
        //we must type cast the dogClassStoredinAnimal back to a dog call the run method
        // as this run method only exists in the Dog class.
        Dog d = (Dog)dogClassStoredinAnimal;
        d.run();
        // direct way without using a variable
        ((Dog)dogClassStoredinAnimal).run(); // short way for line 18 to 22

        // int num = (int) 10.5 --> typecasting for primitive data type

        /* LONG WAY
        Dog dog = new Dog("Bean","Black", "");
        dog.speak();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat("Kali","Black","Asian");
        cat.speak();
        cat.eat();
        cat.sleep();


        Horse horse = new Horse("Bravo", "Brown", "American");
        horse.eat();
        horse.speak();
        horse.sleep();
        */







    }
}