package Class17;

public class Car {

    String make;
    String model;
    int engineCC;
    String color;

    /*
     Car(String make, String model, int engineCC, String color){
         make=make;
         model=model;
         engineCC=engineCC;
         color=color;
     }
     it will run into a problem because we use data type names the same as
     instance variables. we can avoid this by using 'this' keyword.
     */
    Car(String make, String model, int engineCC, String color) {
        this.make = make;
        this.model = model;
        this.engineCC = engineCC;
        this.color = color;
    }

    void printInfo() {
        System.out.println(make + " " + model + " " + engineCC + " " + color);
    }


    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic type R", 1800, "white");
        car.printInfo();

    }
}
