package Class25;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {
        //we can store the objects of a class in a variable who's type is interface
        Headset headset1 = new Headset("Razer Nari Ultimate", 79.99, 4620);
        Headset headset2 = new Headset("NEW SteelSeries Arctis", 52.64, 4868);
        Headset headset3 = new Headset("HyperX Cloud II", 0, 32116);
        System.out.println(headset1.toString());

        List<Headset> headsets = new ArrayList<>();
        headsets.add(headset1);
        headsets.add(headset2);
        headsets.add(headset3);
        //printList(headsets);
        System.out.println(headsets);

//break till 12:05

    }

    public static void printList(List<Headset> headsets) {
        for (Headset h : headsets) {
            h.printInfo();
        }
    }
}

class Headset{
    private String title;
    private double price;
    private int noOfReviews;

    public Headset(String title, double price, int noOfReviews) {
        this.title = title;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }

    public void printInfo() {

    }

    @Override
    public String toString() {
        return "Headset{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", noOfReviews=" + noOfReviews +
                '}';
    }
}