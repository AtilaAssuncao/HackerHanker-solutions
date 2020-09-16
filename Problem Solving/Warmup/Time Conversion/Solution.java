import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

     /*
     * Complete the timeConversion function below.
     */
     static String timeConversion(String s) {
          /*
          * Write your code here.
          */
          String horaMilitar = null ;

          String hora[] = s.split(":");
          char[] time = hora[2].toCharArray();
               
          if( time[2] == 'A' && hora[0].equals("12") ){
               horaMilitar = "00:"+hora[1]+":"+time[0]+""+time[1];
          }
          if ( time[2] == 'A' && !hora[0].equals("12") ) {
               horaMilitar = hora[0]+":"+hora[1]+":"+time[0]+""+time[1];
          }
          if ( time[2] == 'P' ) {
               int h = Integer.parseInt(String.valueOf(hora[0]));
               horaMilitar = (h+12)+":"+hora[1]+":"+time[0]+""+time[1];
          }
          if ( time[2] == 'P' && hora[0].equals("12")) {
               int h = Integer.parseInt(String.valueOf(hora[0]));
               horaMilitar = (h)+":"+hora[1]+":"+time[0]+""+time[1];
          }
          
          return horaMilitar;
     }

     private static final Scanner scan = new Scanner(System.in);

     public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

          String s = scan.nextLine();

          String result = timeConversion(s);

          bw.write(result);
          bw.newLine();

          bw.close();
     }
}
