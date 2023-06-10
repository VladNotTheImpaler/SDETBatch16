package Class5;

import java.sql.SQLOutput;

public class E7LogicalOperators {
    public static void main(String[] args) {

        String name = "Safyan";

        if (!name.equals("Karen")){
            System.out.println("Do not give discount");
            // if variable is NOT equal to "Karen" - you will get a discount
        }
        if (name != "Karen"){
            System.out.println("Do not give discount");
        }
    }
}
