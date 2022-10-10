public class Main {
    public static void main(String[] args) {
        int a = 1, b = 0, aux = 0;

        for(int i = 0; i < 10; i++) {
            aux = a; //aux = 3
            a = a + b; //a = 3 + 2
            b = aux; // b = 2

            System.out.println(a);
        }

    }
}