package app;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int index = 1;
        while(scanner.hasNextLine()){
            String data= scanner.nextLine();
            if(data.equals(""))
            break;
            System.out.printf("%d %s%n", index, data);
            index++;
        }
            
        scanner.close();
    }
}