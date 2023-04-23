package HW.Class12HW;

public class Task3 {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first
         names and if they expecting boy or girl?
         Based on the input suggests a name for a baby:
         Example Output:
         Mom’s first name? Mary
         Dad’s first name? Daniel
         Boy or Girl? boy
         Suggested baby name: DANRY

         Example Output:
         Mom’s first name? Mary
         Dad’s first name? Daniel
         Boy or Girl? girl
         Suggested baby name: MAIEL

         */
        String gender = "girl";
        String papi = "Daniel";
        String mami = "Mary";

        if (gender.equals("boy")) {
            System.out.println("Mom's first name? " + mami);
            System.out.println("Dad's first name? " + papi);
            System.out.print("Suggested baby name: " + papi.substring(0, 3) + mami.substring(mami.length() - 2));
        } else {
            System.out.println("Mom's first name? " + mami);
            System.out.println("Dad's first name? " + papi);
            System.out.print("Suggested baby name: " + mami.substring(0, 2) + papi.substring(papi.length() - 3));
        }
    }
}