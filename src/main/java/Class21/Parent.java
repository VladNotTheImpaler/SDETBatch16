package Class21;

public class Parent {
    void getMarry(){
        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}

class Axel extends Parent {
    @Override
    void study(){
        System.out.println("No, i want SDET");
    }
}
