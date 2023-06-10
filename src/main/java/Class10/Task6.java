package Class10;
/*
Create an array of integers and calculate the sum of all elements
in an array
 */
public class Task6 {
    public static void main(String[] args) {

        int [] numbers={10,20,30,50};
        int sum=0;

        for(int num:numbers){
            sum=sum+num;
        }
        System.out.println(sum);

    }
}