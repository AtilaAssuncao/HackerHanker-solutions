import java.io.*;
import java.util.*;

public class Solution {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int t = in.nextInt();
          int[] n = new int[t];
          
          for (int i = 0; i < t; i++ ) {
               n[i] = in.nextInt();
          } 
          
          Arrays.sort(n);
          
          int q1 = firstQartiles( n.length, n );
          int q2 = median( n.length, n );
          int q3 = thirdQartiles( n.length, n );

          System.out.printf("%d\n%d\n%d\n", q1, q2, q3);
     }
     
     public static int firstQartiles( int n, int[] arr ) {
          int aux = n - median( n ), indice = 0, indice2 = 0;
          
          if ( n%2 == 0 ){
               if ( aux%2 == 0 )  {
                    indice = (int)(( n + 1) / 4);
                    indice2 = (int)(( n + 1) / 4)+1;
                    return ( arr[ indice-1 ] + arr[ indice2-1 ] ) / 2;
               }
               indice = ( n + 2 ) / 4;
               return arr[ indice-1 ] ;
          } 
          
          if ( aux%2 == 0 )  {
               indice = (int)(( n + 1) / 4);
               indice2 = (int)(( n + 1) / 4)+1;
               return ( arr[ indice-1 ] + arr[ indice2-1 ] ) / 2;
          }
     
          indice = ( n + 3) / 4;
          return arr[ indice-1 ];
     }
     
     public static int thirdQartiles( int n, int[] arr ) {
          int aux = n - median( n ), indice = 0, indice2 = 0;
          
          if ( n%2 == 0 ) {
               if ( aux%2 == 0 )  {
                    indice = (int)((( n * 3 ) + 3) / 4);
                    indice2 = (int)((( n * 3 ) + 3) / 4)+1;
                    return ( arr[ indice-1 ] + arr[ indice2-1 ] ) / 2;
               }
               indice = (( n * 3 ) + 2 ) / 4;
               return arr[ indice-1 ];
          }
          
          if ( aux%2 == 0 )  {
               indice = (int)((( n * 3 ) + 3) / 4);
               indice2 = (int)((( n * 3 ) + 3) / 4)+1;
               return ( arr[ indice-1 ] + arr[ indice2-1 ] ) / 2;
          }
          
          indice = (( n * 3 ) + 1) / 4;
          return arr[ indice-1 ];
     }
     
     public static int median( int n, int[] arr ) {
          int indice = 0, indice2 = 0;
          
          if ( n%2 == 0 )  {
               indice = (int)(( n + 1 ) / 2 );
               indice2 = (int)(( n + 1 ) / 2 )+1;
               return ( arr[ indice-1 ] + arr[ indice2-1 ] ) / 2;
          }
          
          indice = ( n + 1 ) / 2 ;
          return arr[ indice-1 ];
     }
     
     public static int median( int n ) {
          return ( n + 1 ) / 2 ;
     }
}
