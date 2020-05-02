package app;

import java.util.Scanner;

public class App {
    public static byte B;
    public static byte H;
    public static boolean flag = false;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextByte();
        H = sc.nextByte();
        if(  (B > 0 && B <= 100) && (H > 0 && H <= 100) )
            flag = true;
        else 
            System.out.printf("java.lang.Exception: Breadth and height must be positive");
		
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
        } 
	}//end of main
}