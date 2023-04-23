package Class13;

public class Task3 {
    public static void main(String[] args) {

        String a="Is it Saturday? Is it raining? Do wwe have a Java Class today?";
        String [] strArr=a.split("[.!?]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());

    }
}
