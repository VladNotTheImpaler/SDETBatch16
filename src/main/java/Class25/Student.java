package Class25;

public class Student {

    String name;
    String id;
    int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' + // this  \' escape sequence or use "'"
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
