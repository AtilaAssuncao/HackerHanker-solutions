import java.io.*;
import java.util.*;

public class Solution {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int t = in.nextInt();
     
          int[] xn = new int[t], wn = new int[t];
          int somaX = 0, somaW = 0; 
          float media = 0;
          
          for ( int i = 0; i< t ; i++ ) {
               xn[i] = in.nextInt();
          } 
          for ( int i = 0; i< t ; i++ ) {
               wn[i] = in.nextInt();
               somaX += (xn[i] * wn[i]);
               somaW += wn[i];
          } 
          
          media = (float)somaX/somaW;
          System.out.printf("%.1f",media);
     }
}
