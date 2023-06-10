package Class17;

public class Dog {
    private String name;
    private String color;
    private String breed;
    private int age;

    Dog(String dogName, String dogColor, String dogBreed, int dogAge) {


        name = dogName;
        color = dogColor;
        breed = dogBreed;
        age = dogAge;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age);
    }
    // create 5 objects of this dog class provide initial values and for each
    // object call the printInfo method.
}
