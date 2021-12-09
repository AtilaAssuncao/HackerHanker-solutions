import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        String line;
       
        int i = 1;
        while((line = buffered.readLine()) != null) {
            System.out.println((i++)+" "+line);
        }
    }
}
