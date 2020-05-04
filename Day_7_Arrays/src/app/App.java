package app;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.useDelimiter("\\n");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = (arrItems.length-1); i >= 0; i--) {
            System.out.printf("%s ", arrItems[i]);
        }

        scanner.close();
    }
}