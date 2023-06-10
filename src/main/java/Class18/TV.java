package Class18;

public class TV {
    //Private members of the superclass are not inherited by the subclass
    private int size;
    protected String make;
    String model;
}

class SamsungTV extends TV {

}

class TVTester {
    public static void main(String[] args) {
        SamsungTV sm = new SamsungTV();

    }
}