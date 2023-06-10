package Class30;

import java.util.ArrayList;
import java.util.List;

public class E6Methods {
    public static void main(String[] args) {
        E6Methods e4Methods = new E6Methods();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(40);
        arrayList.add(30);
        arrayList.add(10);
        e4Methods.print(arrayList);
    }

    void print(List<Integer> list){

        for (Integer l : list) {  // can use var or int (boxing, autoboxing)
            System.out.println(l);

        }
    }
}
