package Class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
 Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
 */
/*
How can you remove all duplicates from ArrayList?

List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
 */
public class Task {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedHashSet<String> noDuplicates = new LinkedHashSet<>(aList);
        System.out.println(noDuplicates);
    }
}
