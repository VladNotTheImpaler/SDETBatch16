package Class22;

public class AnimalTester {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("jacky", "Black", "Unknown"),
                new Cat("Tom", "Blue", "Persian")};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.printInfo();
        }
    }
}