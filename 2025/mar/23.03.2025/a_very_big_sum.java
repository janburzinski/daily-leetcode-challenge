import java.util.List;

class Result {
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;

        for(long s : ar)
            sum += s;
        
        return sum;
    }
}