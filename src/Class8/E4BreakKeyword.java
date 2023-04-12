package Class8;

public class E4BreakKeyword {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                break; // will terminate the loop after 5 iterations
            }
            System.out.println(i);

        }


        int sum=0;
        for (int i = 0; i < 50; i++) {
            sum=sum+i;
            if (sum>-300){
                System.out.println(i);
                break;
            }
        }

    }
}
