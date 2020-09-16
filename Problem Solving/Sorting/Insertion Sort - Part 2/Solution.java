import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     // Complete the insertionSort2 function below.
     public static void insertionSort2( int n, int[] arr ) {
          
          int i = 0, atual = 0, aux_i = 0;
          for( i = 1; i < n; i++ ) {
               atual = arr[i];
               aux_i = ( i - 1 );
               
               while( aux_i >=0 && atual < arr[aux_i] ) {
                    arr[aux_i+1] = arr[aux_i];
                    aux_i--;
               }
               arr[aux_i+1] = atual;
               
               printArr( arr );
          }
          
     }
     
     public static void printArr( int[] arr ) {
          for( int i = 0; i < arr.length; i++ ) {
               System.out.print( arr[i]+ " " );
          }
          System.out.print("\n");
     }

     private static final Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) {
          int n = scanner.nextInt();
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          int[] arr = new int[n];

          String[] arrItems = scanner.nextLine().split(" ");
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          for (int i = 0; i < n; i++) {
               int arrItem = Integer.parseInt(arrItems[i]);
               arr[i] = arrItem;
          }

          insertionSort2(n, arr);

          scanner.close();
     }
}
