package Class21;

public class StudentTester {
    public static void main(String[] args) {

        Student student[] = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student mates : student) {

            if (mates instanceof SyntaxStudent) {
                ((SyntaxStudent) mates).typingInChat();
            } else if (mates instanceof SchoolStudent) {
                ((SchoolStudent) mates).fight();
            }
            mates.study();
            mates.talk();
            mates.walk();
        }

        // break till 2:17

        Student syntax = new SchoolStudent();
        if (syntax instanceof SyntaxStudent) {
            ((SyntaxStudent) syntax).typingInChat();
        } else {
            System.out.println("Wrong type of object is present in syntax var casting will fail");
        }


        Student school = new SchoolStudent();
        ((SchoolStudent) school).fight();


    }
}