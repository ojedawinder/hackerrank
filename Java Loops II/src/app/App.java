package app;

import java.util.Scanner;

public class App {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int total = 0;

            for(int k=0;k<n;k++){
                if(k==0)
                    total = (int)(a + (Math.pow(2, k)*b));
                else {
                    total += (int)(Math.pow(2, k)*b);
                }
                System.out.printf("%d ", total);
            }
            System.out.println("");
        }
        in.close();
    }
}