package app;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }

        }

        int[] sums = new int[16];
        int index = 0;

        int row = 0;
        int column = 0;
        int max = -9999999;

        while(row<4){
            if(column>3){
                row++;
                column=0;
                continue;
            }
                
            sums[index] = arr[row][column] + arr[row][column+1] + arr[row][column+2];  
            sums[index]+= arr[row+1][column+1];  
            sums[index]+= arr[row+2][column] + arr[row+2][column+1] + arr[row+2][column+2];  
            if(sums[index]>max)
                max = sums[index];

            System.out.printf("Posiciones [%d][%d] [%d][%d] [%d][%d] [%d][%d] [%d][%d] [%d][%d] [%d][%d] %n", row, column,row, column+1, row, column+2, row+1, column+1, row+2, column, row+2, column+1, row+2, column+2);
            System.out.printf("Valores %d %d %d %d %d %d %d %n", arr[row][column], arr[row][column+1], arr[row][column+2],arr[row+1][column+1], arr[row+2][column], arr[row+2][column+1], arr[row+2][column+2]);
            System.out.printf("sums[%d] %d %n", index, sums[index]);
            System.out.printf("Max %d %n", max);

            index++;
            column++;
        }

        scanner.close();
        System.out.printf("%d%n", max);
    }
}