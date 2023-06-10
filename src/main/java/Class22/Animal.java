package Class22;

/*
    create 3 animals like Dog Cat and Horse
    define 3 common methods in each class like speak eat and sleep.
    create the object of all the classes and call the methods.
     */
public abstract class Animal {

    private String name;
    private  String color;
    final private  String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    abstract void speak();

    abstract void eat();

    abstract void sleep();

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }

}

class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Woof woof");
    }

    @Override
    void eat() {
        System.out.println("chewing bones");
    }

    void sleep() {
        System.out.println("Sleeping ZZZZZZZZZZZZZzzzzZZZ 8 to 10 hours");
    }
}

class Cat extends Animal {
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Meow Meow");
    }

    @Override
    void eat() {
        System.out.println("Eating Fish");
    }

    void sleep() {
        System.out.println("Sleeping ZZZZZZZZZZZZZzzzzZZZ 12 to 16 hours");
    }
}


