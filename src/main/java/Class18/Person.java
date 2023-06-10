package Class18;

public class Person {
    String name;
    void sleep(){
        System.out.println("ZZZZzzzzZZZZzzz....");
    }
}

class Employee extends Person{

}

class Tester extends Employee{

    // Break till 01:51
}
class PersonTester{
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.sleep();
        Tester tester=new Tester();
        tester.name="Sarah";
        tester.sleep();

    }
}
