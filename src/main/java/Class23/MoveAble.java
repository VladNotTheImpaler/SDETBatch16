package Class23;

public interface MoveAble {
    //  public static final int age;
    int age = 12;

    void move();
}

interface WashAble{
    void wash();
}

class Dog implements MoveAble,WashAble {

    public void move() {
        System.out.println("Dogs can......");
    }

    @Override
    public void wash() {
        System.out.println("You can wash me");
    }
}
class Cat implements MoveAble{
    @Override
    public void move() {
        System.out.println("Cats can also move");
    }
}
class Horse implements MoveAble{
    public void move() {
        System.out.println("Horses can also move");
    }
}