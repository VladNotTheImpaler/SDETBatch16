package Class7.Class7HW;

public class Class7HW3 {
    public static void main(String[] args) {
        // first way
        for (int i = 20; i >1 ; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        // second way
        int num = 20;
        while (num>1){
            System.out.print(num+" ");
            num-=2;
        }
    }
}
