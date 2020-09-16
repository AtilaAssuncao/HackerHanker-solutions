import java.io.*;
import java.util.*;

public class Solution {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int t = in.nextInt();
          
          int[] vet = new int[t], cont = new int[vet.length];
          float soma = 0, media = 0, mdiana = 0;
          int moda = 0, vezes = 0;
          
          for (int i = 0; i < t; i++ ) {
               vet[i] = in.nextInt();
               soma+= vet[i];
          } 
          
          Arrays.sort(vet); 
          for ( int i=0; i < vet.length; i++ ) {
               for ( int j = 0; j < vet.length; j++ ) {
                    if( vet[i] == vet[j] ) cont[i]++;
               }
          }
          for ( int k =0; k< cont.length; k++) {
               if( cont[k] > vezes ){
                    vezes = cont[k];
                    moda =  vet[k];
               }
          }
          
          if( t%2 != 0 ) {
               mdiana = vet[(t/2)];
          } else {
               mdiana = (float)(vet[((t+1)/2)] + vet[((t-1)/2)])/2;
          }
          
          media = soma/vet.length; 
          System.out.printf("%.1f\n%.1f\n%d",media, mdiana, moda);
     }
}
