import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     // Complete the camelcase function below.
     static int camelcase(String s) {

          int rs = 0;
          for ( int i = 0; i < s.length(); i++ ) {
               if( i == 0 ) rs++;
               String aux = Character.toString(s.charAt(i));
               if( aux.toUpperCase().equals(aux) ) rs++;
          }
          return rs;
     }

     private static final Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) throws IOException {
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

          String s = scanner.nextLine();

          int result = camelcase(s);

          bufferedWriter.write(String.valueOf(result));
          bufferedWriter.newLine();

          bufferedWriter.close();

          scanner.close();
     }
}
