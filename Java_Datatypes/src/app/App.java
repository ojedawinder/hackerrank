package app;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(Integer i = 1; i <= T; i++){
            
            String data= scanner.next();

            try {
                Long num = Long.parseLong(data);
                System.out.printf("%s can be fitted in:%n", data);
                if(num >= Math.pow(-2, 7) && num <= (Math.pow(2, 7) -1))
                    System.out.printf("* byte%n");
                if(num >= Math.pow(-2, 15) && num <= (Math.pow(2, 15) -1))
                    System.out.printf("* short%n");
                if(num >= Math.pow(-2, 31) && num <= (Math.pow(2, 31) -1))
                    System.out.printf("* int%n");
                if(num >= Math.pow(-2, 63) && num <= (Math.pow(2, 63) -1))
                    System.out.printf("* long%n");
            } catch (NumberFormatException e) {
                System.out.printf("%s can't be fitted anywhere.%n", data);

            }      

        }
            
        scanner.close();
    }
}