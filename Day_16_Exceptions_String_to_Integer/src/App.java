import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            String S = in.next();
            int number = Integer.parseInt(S);
            System.out.printf("%d%n", number);
        }catch(Exception ex){
            System.out.println("Bad String");
        }
        in.close();
        
    }
}
