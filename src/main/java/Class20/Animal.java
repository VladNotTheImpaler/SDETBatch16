package Class20;

public class Animal {
    /*
       Below we have fields/properties/attributes/ instance variables
        */
    String name;
    String color;
    int age;
    Animal(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

    void sleep(){
        System.out.println("ZZZZzzzzZZZZ");
    }
    void eat(){
        System.out.println("eating");
    }
    void speak(){
        System.out.println("speaking");
    }
}
class Dog extends Animal{
    Dog(String name,String color,int age){
        super(name, color, age);
    }

    @Override
    void sleep(){
        System.out.println("I like to sleep for 10.6 hours a day");
    }
}
class Cat extends Animal{
    Cat(String name,String color,int age){
        super(name, color, age);
    }

}
class Horse extends Animal{
    Horse(String name,String color,int age){
        super(name, color, age);
    }
}