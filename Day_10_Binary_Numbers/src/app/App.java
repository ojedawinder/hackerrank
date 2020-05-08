package app;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binaryString =  Integer.toBinaryString(n);
        System.out.printf("%s%n", binaryString);
        int times = 0;
        int max = 0;
        int size = binaryString.length();
        int left = size;
        for(int i= 0; i < size ; i++){
            char bin = binaryString.charAt(i);
            if(bin=='1') times++;
            else times = 0;

            if(times > max)
                max = times;

            left = size - i;

            if(max>left && bin=='0'){
                System.out.printf("%d", max);
                return;
            }
        } 
        System.out.printf("%d", max);
          
        scanner.close();
    }
}