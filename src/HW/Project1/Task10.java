package HW.Project1;

public class Task10 {
    public static void main(String[] args) {
        String[] myArray = {"apple", "banana", "orange", "apple", "kiwi", "banana"};

        int dublicates = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i].equals(myArray[j])) {
                    dublicates++;
                    System.out.println("Duplicate string: " + myArray[i]);
                    break;
                }
            }
        }
        if (dublicates == 0) {
            System.out.println("No duplicate strings found.");
        }
    }
}