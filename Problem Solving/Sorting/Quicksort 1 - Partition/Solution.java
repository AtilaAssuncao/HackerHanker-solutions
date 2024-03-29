import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     // Complete the quickSort function below.
     static int[] quickSort(int[] arr) {

          int equal = arr[0];
          String left = "", right = "", result = null;
          
          for (int i = 1; i < arr.length; i++ ) {
               if ( equal > arr[i] ) {
                    left = ""+arr[i]+ " " + left;
               }
               if ( equal < arr[i] ) {
                    right = right+" "+arr[i]+"";
               }
          } 
          result = left + "" + equal+ "" + right;
          return stringToIntConverter(result.split(" "));
     }

     public static int[] stringToIntConverter( String[] el ) {
          int[] rs = new int[el.length];
          for ( int i = 0; i < el.length; i++ ) {
               rs[i] = Integer.parseInt(el[i]);
          }
          return rs;
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

          int[] result = quickSort(arr);

          for (int i = 0; i < result.length; i++) {
               bufferedWriter.write(String.valueOf(result[i]));

               if (i != result.length - 1) {
                    bufferedWriter.write(" ");
               }
          }

          bufferedWriter.newLine();

          bufferedWriter.close();

          scanner.close();
     }
}
