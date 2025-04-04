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
    
    public static void plusMinus(List<Integer> arr) {
        int positivesFound = 0;
        int negativesFound = 0;
        int zeroFound = 0;
        int total = arr.size();

        for (int num : arr) {
            if (num > 0)
                positivesFound++;
            if (num < 0)
                negativesFound++;
            if (num == 0)
                zeroFound++;
        }

        double solPos = (double) positivesFound / total;
        double solNeg = (double) negativesFound / total;
        double solZero = (double) zeroFound / total;

        System.out.println(String.format("%.6f", solPos));
        System.out.println(String.format("%.6f", solNeg));
        System.out.println(String.format("%.6f", solZero));
    }

}