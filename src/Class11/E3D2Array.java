package Class11;

public class E3D2Array {
    public static void main(String[] args) {

        String[][] names2DArray = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };

        //Break till 11:53
        for(String [] name1DArr:names2DArray){

            for (String name:name1DArr){
                System.out.println(name);
            }
        }



    }
}