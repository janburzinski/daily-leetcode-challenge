import java.util.List;

class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int total = 0;
        int aLast = a.get(a.size() - 1);
        int bLast = b.get(b.size() - 1);

        for(int i = aLast; i <= bLast; i++) {
            final int current = i;
            boolean aFactor = a.stream().allMatch(value -> current % value == 0);
            boolean bFactor = b.stream().allMatch(value -> value % current == 0);
            if(aFactor && bFactor) total++;
        }

        return total;
    }
}