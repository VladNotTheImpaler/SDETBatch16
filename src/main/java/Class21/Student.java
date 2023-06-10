package Class21;

public class Student {
    void study(){
        System.out.println("Students are studying");
    }

    void talk(){
        System.out.println("Students are talking");
    }

    void walk(){
        System.out.println("Students are walking");
    }

}


class SyntaxStudent extends Student{

    @Override
    void study(){
        System.out.println("Syntax Students are practicing Java");
    }
    @Override
    void talk(){
        System.out.println("Talking to Asghar and Soheil, Sumair, and Asel");
    }

    @Override
    void walk(){
        System.out.println("Walking to the room before class starts");
    }

    void typingInChat(){
        System.out.println("Typing in Macbook to participate");
    }
}



class CollegeStudent extends Student{
    @Override
    void study(){
        System.out.println("College Students are studying for the Math final exam");
    }
    @Override
    void talk(){
        System.out.println("Talking to the mates for help");
    }
    @Override
    void walk(){
        System.out.println("College Students walking to their dorms");
    }

}



class SchoolStudent extends Student{
    @Override
    void study(){
        System.out.println("School students are in Spanish class");
    }

    @Override
    void talk(){
        System.out.println("Talking to counselor for extra help");
    }
    @Override
    void walk(){
        System.out.println("School Students walking to the lunch room");
    }

    void fight(){
        System.out.println("Kids are fighting");
    }

}