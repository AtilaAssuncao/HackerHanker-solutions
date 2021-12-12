import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        System.out.println(A.length() + B.length());
        System.out.println(A.compareToIgnoreCase(B) > 0? "Yes" : "No");
        System.out.println(toFirstUpperCase(A) + " " + toFirstUpperCase(B));
        
    }
    
    public static String toFirstUpperCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
