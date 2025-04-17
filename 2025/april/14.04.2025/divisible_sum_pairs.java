import java.util.List;

class Result {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int c = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i > j || i == j) continue;

                int valOne = ar.get(i);
                int valTwo = ar.get(j);

                if((valOne + valTwo) % k == 0) {
                    c++;
                }
            }
        }

        return c;
    }
}