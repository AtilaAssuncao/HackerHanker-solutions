import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     // Complete the utopianTree function below.
     static int utopianTree(int n) {

          int h = 1;
          if( n >= 0 && n <= 60 ) {
               for ( int i = 0; i < n; i++ ) {
                    if( i%2 == 0 ) h *= 2 ;
                    if( i%2 == 1 ) h++;
               } 
          }
          return h;

     }

     private static final Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) throws IOException {
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

          int t = scanner.nextInt();
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          for (int tItr = 0; tItr < t; tItr++) {
               int n = scanner.nextInt();
               scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

               int result = utopianTree(n);

               bufferedWriter.write(String.valueOf(result));
               bufferedWriter.newLine();
          }

          bufferedWriter.close();

          scanner.close();
     }
}
