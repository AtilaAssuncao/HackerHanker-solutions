import java.util.*;
import java.io.*;

class Solution{
    
        public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            createSeries(a, b, n);
        }
        in.close();
    }
    
    
    public static void createSeries(int a, int b, int n) {
        int aux = 0;
        for (int i = 0; i < n; i ++) {
            aux = (aux != 0 ? aux : a) + (int)Math.pow(2, i) * b;
            System.out.print((i == 0 ? aux : " " + aux));
        }
        System.out.print("\n");
    }
}
