import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     // Complete the runningTime function below.
     static int runningTime(int[] arr) {

          int atual = 0, aux_i = 0, ct = 0;
          for( int i = 1; i < arr.length; i++ ) {
               atual = arr[i];
               aux_i = ( i - 1 );
               
               while( aux_i >=0 && atual < arr[aux_i] ) {
                    arr[aux_i+1] = arr[aux_i];
                    aux_i--;
                    ct++;
               }
               arr[aux_i+1] = atual;
          }
          return ct;
     }

     private static final Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) throws IOException {
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

          int n = scanner.nextInt();
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          int[] arr = new int[n];

          String[] arrItems = scanner.nextLine().split(" ");
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          for (int i = 0; i < n; i++) {
               int arrItem = Integer.parseInt(arrItems[i]);
               arr[i] = arrItem;
          }

          int result = runningTime(arr);

          bufferedWriter.write(String.valueOf(result));
          bufferedWriter.newLine();

          bufferedWriter.close();

          scanner.close();
     }
}
