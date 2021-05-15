import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
        
        Matcher numbers = Pattern.compile("\\d").matcher(password);
        Matcher lower_case = Pattern.compile("[a-z]").matcher(password);
        Matcher upper_case = Pattern.compile("[A-Z]").matcher(password);
        Matcher special_characters = Pattern.compile("\\W").matcher(password);

        int count = 0;
        if (!numbers.find()) count++;
        
        if (!lower_case.find()) count++;
        
        if (!upper_case.find()) count++;
        
        if (!special_characters.find()) count++;
 
        return Math.max(count, (6 - n));
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
