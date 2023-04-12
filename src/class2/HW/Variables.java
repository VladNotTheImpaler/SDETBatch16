package class2.HW;

public class Variables {
    public static void main(String[] args) {

    // We are declaring our variables
    String name="Vlad";
    String lastName="Masnic";
    String grade="B";
    String city="New York City";
    String state="NY";
    String phoneNumber="+1 111-222-3333";

    // 2nd step We are using statement sout to print variables listed above + our phrases
    System.out.println("My name is " + name + " and my last name is " + lastName);
    System.out.println("I am " + grade + " grade student");
    System.out.println("I live " + city + "," +  state);
    System.out.println("And my phone number is " + phoneNumber);

    // 3rd step we change the value of our variables
    grade="A";
    city="Chicago";
    state="IL";
    phoneNumber="+1 111-222-444";

        /*4th step - Just to make my life easier i`ll just copy/paste step #2 and i`ll change values
        for the line 17 and 18 to get Asghar`s desired output.
        "My name is Vladimir Masnic and I moved to new city and new state. My new phone number is"
         */
    System.out.println("Updated Info");
    System.out.println("My name is " + name + " and my last name is " + lastName);
    System.out.println("I am " + grade + " grade student");
    System.out.println("I moved in " + city + "," + state);
    System.out.println("And my phone new number is " + phoneNumber);
    }
}