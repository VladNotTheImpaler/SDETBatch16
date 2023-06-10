package HW.Class13HW;

public class Task1ReversedWords {
    /*
    How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
     */
    public static void main(String[] args) {

        String s1 = "This is sentence i want to reverse";
        String[] sArr = s1.split(" ");
        for (int i = 0; i < sArr.length; i++) {
            String s3 = sArr[i];
            StringBuilder s4 = new StringBuilder(s3);
            System.out.print(s4.reverse() + " ");

        }

    }
}
