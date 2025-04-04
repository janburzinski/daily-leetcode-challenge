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
    public static int diagonalDifference(List<List<Integer>> arr) {
        int rows = arr.size();
        int solLeft = 0;
        int solRight = 0;

        // left to right diagonal
        
        int iLeft = -1; // used to get the number in the row
        for (int row = 0; row < rows; row++) {
            List<Integer> innerList = arr.get(row);
            iLeft++;
            solLeft += innerList.get(iLeft);
        }
        
        // right to left diagonal

        int iRight = arr.size();
        for(int row = 0; row < arr.size(); row++) {
            List<Integer> innerList = arr.get(row);
            iRight--;
            solRight += innerList.get(iRight);
        }

        // calculate the difference and only return the positive number
        return Math.abs(solLeft - solRight);
    }

}
// System.out.println("row: " + row + " col: " + col + " val: " +
// innerList.get(col));

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
