package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> mapPhoneNumbers= new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            mapPhoneNumbers.put(name, phone);
        }
        in.useDelimiter("\\n");
        while(in.hasNext()){
            String s = in.next();
            if(s.length()==0)
                break;
            Integer number = mapPhoneNumbers.get(s);
            if(number!=null)
                System.out.printf("%s=%d%n", s, number);
            else 
                System.out.println("Not found");
        }
        in.close();
    }
}