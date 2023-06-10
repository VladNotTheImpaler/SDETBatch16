package HW.Class17;

import HW.Class14HW.Student;

public class Students {
    String name;
    int scienceGrade ;
    int pDGrade;
    int historyGrade;

    public Students(String name, int scienceGrade, int pDGrade, int historyGrade) {
        this.name = name;
        this.scienceGrade = scienceGrade;
        this.pDGrade = pDGrade;
        this.historyGrade = historyGrade;
    }
    void averageGrade(){
        int average = (this.historyGrade+this.pDGrade + this.historyGrade)/3;
        System.out.print("Student name is " + name + " ");
        System.out.print("and average grade is "+ average);
        System.out.println();
        System.out.println();

    }

    public static void main(String[] args) {
        Students student1 = new Students("James Charles Bond", 86, 99, 91);
        Students student2 = new Students("Alphonse Gabriel Capone", 25, 90, 50);
        Students student3 = new Students("Antonio Montana", 62, 100, 79);
        Students student4 = new Students("Boris the Warrior", 30, 99, 76);
        Students student5 = new Students("Marie Curie", 100, 88, 100);

        student1.averageGrade();
        student2.averageGrade();
        student3.averageGrade();
        student4.averageGrade();
        student5.averageGrade();

    }
}
