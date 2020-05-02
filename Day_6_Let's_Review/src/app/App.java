package app;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(Integer i = 1; i <= T; i++){
            String nextLine = scanner.nextLine();
            int position = 0;
            String even = "";
            String odd = "";
            int size = nextLine.length();
            while( position < size){
                even+= nextLine.charAt(position);
                if(position+1 < size)
                    odd+= nextLine.charAt(position+1);
                position+=2;
            }
            System.out.printf("%s %s%n", even, odd);
        }
            
        scanner.close();
    }
}