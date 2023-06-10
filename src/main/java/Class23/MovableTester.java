package Class23;

public class MovableTester {
    public static void main(String[] args) {
        MoveAble moveAble=new Horse();
        WashAble washAble=new Dog();
        MoveAble[] moveAbles={new Cat(),new Dog()};

        for (MoveAble m:moveAbles
        ) {
            m.move();
        }
    }
}