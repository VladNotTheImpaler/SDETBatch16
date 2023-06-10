package Class17;

public class Food {
    String name="Pasta";

    void printFood(){
        String name = "Burgers"; //Local Variable - inside the block of code
        //always local variables are preferred by Java
        System.out.println(name); // will print Burgers
        System.out.println(this.name); // will refer to instance variable. line 4
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.printFood();
    }
}
