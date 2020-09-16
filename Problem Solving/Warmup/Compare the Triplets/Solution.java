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

public class Solution {

     // Complete the compareTriplets function below.
     static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
          List<Integer> listResult = new ArrayList<>();
          int pointA = 0, pointB =  0, size = ( a.size() > b.size() )? a.size(): b.size();

          for( int i = 0; i < size; i++ ){

               if((a.get(i) >= 1 && a.get(i) <= 100) && (b.get(i) >= 1 && b.get(i) <= 100)){
                    if ( a.get(i) > b.get(i)) {
                         pointA ++;
                    }
                    if ( a.get(i) < b.get(i)) {
                         pointB ++;
                    } 
               }
          }
          listResult.add(pointA);
          listResult.add(pointB);
          return listResult;
     }

     public static void main(String[] args) throws IOException {
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

          List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
               .map(Integer::parseInt)
               .collect(toList());

          List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
               .map(Integer::parseInt)
               .collect(toList());

          List<Integer> result = compareTriplets(a, b);

          bufferedWriter.write(
               result.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
               + "\n"
          );

          bufferedReader.close();
          bufferedWriter.close();
     }
}
