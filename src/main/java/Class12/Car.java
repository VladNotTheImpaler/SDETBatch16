package Class12;

public class Car {
    // define 5 properties and 3 methods
    String model;
    String make;

    String color;
    int mileage;
    boolean isAutomatic;

    void startCar(){
        System.out.println("Starting "+model+" .....");
    }

    void stopCar(){
        System.out.println("Applying the brakes to stop the car");
    }

    void turn(){
        System.out.println("turning.....");
    }

}