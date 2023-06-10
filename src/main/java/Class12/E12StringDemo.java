package Class12;

public class E12StringDemo {

    public static void main(String[] args) {
        // substring is used to get a part of the complete String
        String sentence="yup we have another class";
        System.out.println(sentence.substring(4));
        System.out.println(sentence.substring(4,11)); // start from index 4 and stop at 11
        System.out.println(sentence.substring(12,19));

        int startIndex=sentence.length()-5; // print last 5 characters
        System.out.println(sentence.substring((startIndex)));
    }
}
