import java.util.List;

class Result {
    public static void miniMaxSum(List<Integer> nums) {
        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;

        for(int i = 0; i < 5; i++) {
            long currentSum = 0;
            for(int j = 0; j < 5; j++) {
                if(i != j) currentSum += nums.get(j);
            }
            minSum = Math.min(currentSum, minSum);
            maxSum = Math.max(currentSum, maxSum);
        }

        System.out.println(minSum + " " + maxSum);
    }
}