package Class20;

public class Parent {
    void getMarry(){
        System.out.println("Marry to the girl of our choice");
    }

    private void accessBank(){
        System.out.println("Accessing bank");
    }

    static void printNumber(){
        System.out.println(10);
    }
}

class Axel extends Parent {

    @Override
    public   void getMarry() {
        System.out.println("I want to marry Karol G");
    }
}
class ParentTester{
    public static void main(String[] args) {
        Axel axel=new Axel();
        axel.getMarry();
        Axel.printNumber();
    }
}