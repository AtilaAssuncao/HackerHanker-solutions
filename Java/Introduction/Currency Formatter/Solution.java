import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        System.out.println("US: " + currencyFormatter(Locale.US, payment));
        System.out.println("India: " + currencyFormatter(new Locale("en", "IN"), payment));
        System.out.println("China: " + currencyFormatter(Locale.CHINA, payment));
        System.out.println("France: " + currencyFormatter(Locale.FRANCE, payment));
    }
    
    public static String currencyFormatter(Locale language, double payment) {
        return NumberFormat.getCurrencyInstance(language).format(payment);
    }
}