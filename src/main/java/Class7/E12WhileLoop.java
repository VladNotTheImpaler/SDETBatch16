package Class7;

public class E12WhileLoop {
    public static void main(String[] args) {
        // add all the numbers from 1 to 10 and display the  result 55

        int counter=1;
        int sum=0;
        while (counter<=10){
            sum=sum+counter; // same as sum+=counter
            counter++;
        }
        System.out.println(sum);

    }
}
