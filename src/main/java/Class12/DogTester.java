package Class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog=new Dog();
        actualDog.name="Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;

        actualDog.bark();

        Dog obj=new Dog();
        obj.name="Bean";
        obj.age=8;
        obj.breed="Pintscher";
        obj.color="Black";
        obj.weight=15;
        obj.isFat=true;


    }
}
