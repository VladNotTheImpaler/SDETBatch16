package Class16;

public class DogTester {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.breed="German";
        dog1.color="Black";
        dog1.name="jack";

        Dog dog2=new Dog();
        dog2.breed="Persian";
        dog2.color="White";
        dog2.name="Sam";

        dog2.printInfo();

        Dog.age=20;
        Dog.printInfo2();
        dog1.age=30;
        Dog.printInfo2();



    }
}