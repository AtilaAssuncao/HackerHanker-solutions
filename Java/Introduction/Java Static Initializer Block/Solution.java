import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static Scanner scn = new Scanner(System.in);
    
    public static int H = scn.nextInt();
    public static int B = scn.nextInt();

    public static boolean flag = validation();

    protected static final boolean validation() {
        if (H > 0 && B > 0) return true;
        
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        return false;
    }

    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

