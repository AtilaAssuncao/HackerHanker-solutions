import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     // Complete the beautifulDays function below.
     static int beautifulDays(int i, int j, int k) {
          int rs = 0;
          for( int v = i; v <= j; ++v ) {
               if ( Math.floor( v - reverse ( v ))% k == 0 ) rs++;
          }
          return rs;
     }

     public static int reverse ( int n ) {
          String number = Integer.toString(n), rs = "";
          for ( int i = number.length()-1 ; i >= 0; i-- ) {
               rs += number.charAt(i);
          }
          return Integer.parseInt(rs);  
     }

     private static final Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) throws IOException {
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

          String[] ijk = scanner.nextLine().split(" ");

          int i = Integer.parseInt(ijk[0]);

          int j = Integer.parseInt(ijk[1]);

          int k = Integer.parseInt(ijk[2]);

          int result = beautifulDays(i, j, k);

          bufferedWriter.write(String.valueOf(result));
          bufferedWriter.newLine();

          bufferedWriter.close();

          scanner.close();
     }
}
