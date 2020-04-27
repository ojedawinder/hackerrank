package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        int a = in.nextInt();
        double b = in.nextDouble();
        String n = in.next();
                    
        in.close();
        System.out.printf("%d%n", i + a);
        System.out.printf("%.1f%n", b+d);
        System.out.printf("%s%n", s+n);
    }
}