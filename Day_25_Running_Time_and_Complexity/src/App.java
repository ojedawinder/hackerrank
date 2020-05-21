import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            if(ele<2){
                System.out.printf("Not prime%n");
                continue;
            }
            if(ele>=2 && ele <4){
                System.out.printf("Prime%n");
                continue;
            }
            
            boolean isPrime = true;
            
            int square_root = (int)Math.sqrt(ele);
            for(int i=2; i< (square_root+1); i++ ){
                if(ele%i==0){
                    isPrime = false;
                    System.out.printf("Not prime%n");
                    break;
                }
            }
            

            if(isPrime)
                System.out.printf("Prime%n");
        }
    }
}
