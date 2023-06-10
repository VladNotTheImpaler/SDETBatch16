package Class20;

public class MainOverloading {
    public static void main(String[] args) {
        main();
        main(2);
    }

    public static void main() {
        System.out.println("No parameter");
    }
    public static void main(int number) {
        System.out.println("int argument ");
    }
}
