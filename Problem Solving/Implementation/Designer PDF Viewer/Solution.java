import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     // Complete the designerPdfViewer function below.
     static int designerPdfViewer(int[] h, String word) {

          char[] alf = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
          
          int aux = 0; 
          for ( int i = 0; i < word.length(); i++ ) {
               for (int j = 0; j < h.length; j++) {
                    if(  word.charAt(i) == alf[j] ) {
                         if( aux == 0 ) aux = h[j];
                         if( aux != 0 && aux < h[j] ) aux = h[j];
                    }
               }
          }

          return (aux*word.length());
     }

     private static final Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) throws IOException {
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

          int[] h = new int[26];

          String[] hItems = scanner.nextLine().split(" ");
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          for (int i = 0; i < 26; i++) {
               int hItem = Integer.parseInt(hItems[i]);
               h[i] = hItem;
          }

          String word = scanner.nextLine();

          int result = designerPdfViewer(h, word);

          bufferedWriter.write(String.valueOf(result));
          bufferedWriter.newLine();

          bufferedWriter.close();

          scanner.close();
     }
}
