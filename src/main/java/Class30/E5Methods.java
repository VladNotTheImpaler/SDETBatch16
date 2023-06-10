package Class30;

public class E5Methods {
    public static void main(String[] args) {
        E5Methods e4Methods = new E5Methods();
        e4Methods.printHello("Java", 5);
    }

    private void printHello(String word, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(word);
        }
    }
}
