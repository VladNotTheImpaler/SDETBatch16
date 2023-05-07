package Class17;

public class Person {

    String name;

    Person() {
        System.out.println("No Argument Constructor");
    }

    Person(String personName) {
        name = personName;
        System.out.println("1 Argument Constructor");
    }
}
