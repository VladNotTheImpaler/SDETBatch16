package Class21;

public class Refresher1 {
    public static void main(String[] args) {


        Dog[] dogs = {new Dog("Lal", "Black", "Persian"), new Dog("Papi", "White", "chinese")};
        //  Dog d=dogs[0];
        //  d.printInfo();

      /*
      for(int i=0;i<dogs.length;i++){
            dogs[i].printInfo();
        }
        */

        for (Dog d : dogs) {

            d.printInfo();
        }
    }
}