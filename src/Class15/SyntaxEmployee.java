package Class15;

import jdk.dynalink.NamespaceOperation;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */
    String empID;
    double salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee obj = new SyntaxEmployee();
        obj.empID="007";
        obj.salary=100000;

        System.out.println(obj.empID);
        System.out.println(obj.salary);
        System.out.println(SyntaxEmployee.CEO);


    }


}
