import java.util.*;
import java.io.*;

class Solution{
    
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        int[] a = new int[t], b = new int[t], n = new int[t];
        
        for(int i=0; i<t; i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            n[i] = in.nextInt();
        }
        in.close();
        
        loop(a, b, n, t);
    }
    
    public static void loop(int[] a, int[] b, int[] n , int t) {
        for (int i = 0; i < t; i ++) {
            createSeries(a[i], b[i], n[i]);
            System.out.print("\n");
        }
    }
    
    public static void createSeries(int a, int b, int n) {
        int aux = 0;
        for (int i = 0; i < n; i ++) {
            aux = (aux != 0 ? aux : a) + (int)Math.pow(2, i) * b;
            System.out.print((i == 0 ? aux : " " + aux));
        }
    }
}
