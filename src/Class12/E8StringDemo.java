package Class12;

public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="JAVA is very very easy";
        // method chaining and its possible in String class
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);
        System.out.println(sentence.startsWith("java"));
    }
}
