package Class13;

public class Task2 {
    public static void main(String[] args) {

        int counter = 0;
        String str = "AZdDFadkfkdff123$$$&#1234";

        String str1 = str.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(str1);
        System.out.println(str1.length());


    }
}