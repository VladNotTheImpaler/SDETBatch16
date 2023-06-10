package Class12;

public class Task2 {
    public static void main(String[] args) {

        String name = "Today is Saturday";
        for (int i = 0; i < name.length(); i++) {
            if ( name.charAt(i) == 'a')
                System.out.print(i + " "); // to print indexes
            System.out.println(name.charAt(i)); // to print the values
        }
    }
}
