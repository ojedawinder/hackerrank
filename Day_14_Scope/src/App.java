import java.util.Scanner;

class Difference{
    private int[] elements;
    public int maximumDifference;
    Difference(int[] a){
        this.elements=a;
    }

    public void computeDifference(){
        int size = elements.length;
        for(int i= 0; i< (size-1) ;i++){
            for(int j = (i+1); j < size ;j++){
                int abs = Math.abs( (elements[i]-elements[j])  );
                if(abs>maximumDifference)
                    maximumDifference = abs;
            }
            

        }
    }


}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
