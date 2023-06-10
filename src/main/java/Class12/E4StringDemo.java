package Class12;

public class E4StringDemo {
    public static void main(String[] args) {

        String firstName="Ana";
        String lastName="Tasevska";

        String fullName=firstName+lastName;
        System.out.println();
        System.out.println(firstName.concat(lastName));
        System.out.println(fullName); // same as line 11, so we need to declare it on line 9

    }
}
