package app;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.useDelimiter("\\n");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        //System.out.printf("array items  %s" , Arrays.toString(arrItems));

        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = (arrItems.length-1); i >= 0; i--) {
            //System.out.printf("Posicion : %d de %d : %s ", i, arrItems.length, arrItems[i]);
            System.out.printf("%s ", arrItems[i]);
        }

        scanner.close();
    }
}