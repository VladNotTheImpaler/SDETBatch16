package Class2;

public class PracticeVariables {
    public static void main(String[] args) {

        //Primitive data type
    byte byte1 = 1; // 1 byte --- Whole numbers from -127 to 127
    short short2 = 22; // 2 bytes --- Whole numbers from -32768 to 32767
    int int3 = 333; // 4 bytes --- Whole numbers from -2,147,483,648 to 2,147,483,647
    long long4 = 4444L; // 8 bytes --- Whole numbers from
        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    float float5 = 55.55555F; // 4 bytes --- Fractional numbers for storing 6 to 7 decimal digits
    double double6 = 666.666; // 8 bytes ---  Fractional numbers for storing 15 decimal digits

    boolean boolean7 = false; // 1 byte --- Stores TRUE or FALSE values only
    char char8 = '8'; // 2 bytes --- Stores a single character, letter, number or ASCII value


        System.out.println(byte1);
        System.out.println(short2);
        System.out.println(int3);
        System.out.println(long4);
        System.out.println(float5);
        System.out.println(double6);
        System.out.println(boolean7);
        System.out.println(char8);
    }
}