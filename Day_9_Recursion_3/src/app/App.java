package app;

public class App {
    public static void main(String[] args) throws Exception {
        int f = factorial(6);
        System.out.printf("%d factorial is : %d", 6, f);
    }

    static int factorial(int n) {

        if(n > 1)
            return n * factorial(n-1);
        else 
            return 1;

    }
}