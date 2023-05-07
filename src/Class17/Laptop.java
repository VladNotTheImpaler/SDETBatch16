package Class17;

public class Laptop {
    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchScreen;

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
    }

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
        this.touchScreen = touchScreen;
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "g5", 3, 512,true,false);

        String str = new String();
        new String("str");
        new String(new char[]{'c'});
        new String(new char[]{'c'}, 10, 20);
    }

}


